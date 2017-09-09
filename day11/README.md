## equals(),HashCode()和==

### 基本类型的数据和引用类型的数据

在java语言中，数据的类型的分为两种，基本数据类型（八种）和引用数据类型（三种）。

#### 基本数据类型

* 整型 byte short int long     ex：1，2，3（默认int类型）
* 浮点型 float double            ex：1.0，2.0，30 （默认double类型）
* 字符类型 char                    ex：a,b,c,d
* 布尔类型 boolean               ex: boolean x,x=false

#### 引用数据类型

* 类
* 接口
* 数组

引用类型我的理解就是在实际操作中需要实例化的类型。

### ==的作用

== 是一个运算符，用于比较两个数据是否相等。这里需要提一下，数据的存储方式，不管是引用类型数据还是基本类型数据，都是以二进制码存储在内存中的，这就设计到了，当我们需要存储数据的时候，内存会开辟一块内存空间给我们使用。因此，存在一个数值和地址的编号。

* 比较的是基本数据类型的时候，比较的是他们的数值是否相等。
* 比较的是引用数据类型的时候，比较的他们存值的地址是否相等。


* **注意**被比较的数据必须是同一种数据类型的两种数据，比如说同是int类型的两个数据，或者是同是引用类型类型的两个person数据。

  ​

```java
//比如存在一个Person类
Person p= new Person("张三",23);
Person p1= new Person("张三",23);

//两个基本类型的数据
int a=1；
int b=2；

if（a==b){//由于1！=2 所以输出false
  //dosomething
}
//比较引用类型，比较地址，那么很显然，在堆内存中，new出来了两块区域
//这两块的区域的地址显然是不同的，因此输出为false
if(p1==p2){ //false
//dosomething
}
```

相信你已经明白了==的用途。但是在实际开发中，比如在使用HashMap或者HashSet，Hashtable的过程中，我们并不关心这个地址值是否相等，我们关心的是我存入的一个java bean对象在以上数据结构中是否存在了，如果存在了我只需要调用get(key)方法取出值就行了，我并不希望存入重复的值。

换句话说就是，我们不希望比较引用数据类型的地址是否相等，而是想知道地址里面存入的内容是否相当，来做出判断是否要添加到hashmap等数据结构中去，以备后续开发。因此，为了满足这个需求，equals方法就应运而生了。

### equals()方法

所有类的都具有equals方法，因为所有类的都是继承于object类，equals方法是从根类（object.class）中定义的，因此所有类都有equals方法。

```java
/**
 * 1.定义了一个javaBean对象，存有两个字段，name和age
 * 2.设置了set get方法
 */
public class Worker {
	private String name;
	private int age;
	public Worker() {
		super();
		
	}
	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

```



接下来写一个主方法用来测试。

```java
public static void main(String[] args) {
		Worker w1 = new Worker("张三", 23);
		Worker w2 = new Worker("张三", 23);
		boolean b = w2.equals(w1);
		boolean b1 = w2==w1;
		System.out.println(b);
		System.out.println(b1);
//out ：false false
```

上述代码非常简单，就是使用比较equals方法比较内容，正如我之前提到到，equals方法比较的就是内容。但是奇怪的是和我们之前说的不一样啊，==比较的是地址值，得到false我理解了，但是比较引用类型的应该是true，怎么是false呢，equals方法不就是拿来比较内容的吗，我们接下来慢慢聊。

这和我们得了理解发生矛盾了，说明equals方法出了问题，和我们的理解发生的偏差，因此我们决定跟进equals方法看一下。按住ctrl+equals方法

```java
//object的equals方法
public boolean equals(Object obj) {
    return (this == obj);
}
```

我们得到了如下的方法体，认真看一下就相当于，最后执行的是 student==student1。这些就明白了吧，虽然我们希望比较的是引用数据类型的值，但是在默认的情况下（从object那默认继承的equals方法），最终调用的是==去比较的地址值。所以肯定只能得到的是false。

**解决的办法:**既然我们已经找到病因，也就是说我们不希望比较的是地址值，而是希望比较的是内容，因此我们需要在student类的重写equals方法，因为从object继承来的equals方法默认比较的是地址，因此我们重写如下

```java
//  重写equals方法，主要是比较内容里面的区别（仍不完善）
   public boolean equals(Object obj) {    //Object obj = new Worker();
      Worker w = (Worker)obj;  //向下转型得到Worker的实例，才可以拿到数据进行比较。
      return this.name.equals(w.name) && this.age == w.age;
   }
```

重新运行一下

```java
boolean b = w2.equals(w1); 
System.out.println(b);//true
```

问题就得到解决了。

### HashCode()方法

### 提出问题

为什么要有这个hashCode方法呢？考虑下面的场景

```java
Worker w1 = new Worker("张三", 23);
Worker w11 = new Worker("张三", 23);

HashMap<Worker ,String> hashMap= new HashMap<>();
hashMap.put(w1,"张三");

//两个值不一样违背了第二条约定
System.out.println(w1.hashCode());
System.out.println(w11.hashCode()); 

System.out.println(w1.equals(w11)); //out true
System.out.println(hashMap.get(w1)); //out ：张三
System.out.println( hashMap.get(w11); //out null；
```

我们需要把一个worker对象，添加到hashMap里面，以一个引用类型为worker的对象为键，值为张三。因此我们使用hashmap的get方法，希望根据键取得值。

* 第一个sout语句输出张三是因为，更具键找到了值。
* 但是第二个sout语句却输出了null，这就值得一探究竟了，因为按照之前的说法，我们明明已经实现了worker对象的equals方法，那么只要两个实例是相等的，也就应该是返回张三才对，但是却返回了null；这是为什么；

### 三条约定

* 在应用程序执行期间，只要对象的equals方法的比较操作所有的信息没有修改，那么对这一个对象调用对此，hashCode的方法比如始终如一的返回同一个整数，在同一个应用程序的多次执行过程中，每次执行的返回值可以不相同。
* 如果两个对象根据equals（Object）方法比较是相等的，那么调用这两个对象中的任意一个对象的hashcode方法都必须产生相同的结果。
* 如果两个对象是根据equals（Object）方法比较是不相等的，那么调用这两个对象中的任意一个对象的hashcode方法，则一定产生不同的整数结果，但是程序员应该知道，给不想等的对象产生截然不同的整数结果，有可能提高散列表（hash table）的性能。

在effictive java第二版中第九条开篇就向我们说明了，这是一个常见的错误，根源就在于没有覆盖hashcode方法（hashcode方法也是从object那里继承而来的，和equals方法一样），如果你没有覆盖hashcode方法就会导致该类无法结合所有基于散列的集合一起正常运作，比如说hashMap,HashSet,Hashtable,所有需要到键值对的地方。

你可能想，无所谓啊，我就不用，但是实际开发往往不是这样子的，我们所有的数据都需要容器来装载，而存入一个键值对，然后通过键来找值的方式是非常方便和高性能的。

### 解决问题

你肯定还记得之前提出的问题吧，通过对三条约定的学习，相信你知道了，问题的根源就在于equals方法相等了，但是返回的hashcode的值确是不同的（因为没有复写hashcode方法，object会根据本地资源，为每个实例每次都生成不同的hashcode），违背了第二条约定，所以和所有基于散列结构的容器无法正常工作。

因此我们必须要重写hashcode方法

```java
@Override
public int hashCode() {
   return 1;
}
```

现在我们重写了hashcode的方法。接下来再次运行一下

```java
System.out.println( hashMap.get(w11); //out 张三
```

就可以看到已经不是null，因为我们已经遵守了第二条约定，所以基于散列结构的容器都能正常工作了。问题也就解决了。

### equals和HashCode之间的关系

总结一下，当我们需要使用到基于散列结构的容器（HashMap，HashSet，Hashtable等），应该要保证在两个对象调用equals相等的情况下，他们的hashcode返回同一值。这样才可以保证元素的唯一性，才不会导致重复添加元素。

执行原理是：当调用`hashmap.put()`方法的时候，jvm会先去检索HashCode方法，如果返回值是相等的，进而调用equals方法比较内容，如果内容（各种字段值）相同，那么返回true，数据就不往里面添加，因为里面已经存有该实例，如果返回是false就说明，是不同的实例对象，就往里面存。

因此，保证每个类的HashCode的值的唯一性，有助于提高效率，这也就是第三条约定所谈及的内容，因为，一旦判断出来hashcode不同，就相当于不用比较equals里面的字段，直接存入即可。因此提高了效率。

你可能有个疑问，如何才能保证hashcode的唯一性呢。请看下一个部分。

### equals和HashCode的最佳写法

之前我们提到过，equals的方法不是最完善的判断方法，比如说传入的对象是它自己本身，或者为空的时候呢。这些条件我们都没有作出判断。同样HashCode方法也是如此，总不可能每次都是返回1，2，3，4，5。这样的话，显然是不高效的。

在这里我不打算带着大家一起实现一个非常完善的equals方法或者是HashCode方法了。因为ideal已经帮我们实现好了，现在我们已经知道原理了，重复造轮子的事情，是没有价值的。

在ideal 中的worker类下按住alt+Ins

![](http://ogtmd8elu.bkt.clouddn.com/201709091409_191.png)

可以看到我们只需要选择equals() and hashCode()方法就可以了，这难说可是Google的大牛已经帮我们实现好的了。

```java
@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Worker worker = (Worker) o;

		if (age != worker.age) return false;
		return name.equals(worker.name);
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + age;
		return result;
	}
```

上面代码会根据你的实际字段的改变而改变，这就是大牛们给我们准备好的代码了。里面已经考虑到了，所以可能出现的情况了，所以不需要我们再去手写一个了，明白是这个意思就行了。

代码也不难，相信你看得懂，下面的hashCode方法，并不是说就可以保证百分之一百的效率了，但是已经是尽可能保证的最优化的效率了。

学习到这里，相信你已经全部懂了这三者之间的关系了，面试官一定难不倒你了。



### 源码地址

[Worker.java](https://github.com/YanHuiLi/JavaCoreBasic/blob/master/day11/src/cn/itcast/bean/Worker.java)

[主函数](https://github.com/YanHuiLi/JavaCoreBasic/blob/master/day11/src/cn/itcast/object/Demo4Equals.java)



### 参考文献

* effictive java 第二版