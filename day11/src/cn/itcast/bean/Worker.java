package cn.itcast.bean;

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


	//重写toString方法
	public String toString() {
		return name + "," + age;
	}


	/*
	原始的equals方法比较的保存内容的地址，实际上没有多大意义。
	  public boolean equals(Object obj) {
        	return (this == obj);
    	}
	*/

//	重写equals方法，主要是比较内容里面的区别（仍不晚上）
	public boolean equals(Object obj) {	//Object obj = new Worker();
		Worker w = (Worker)obj;  //向下转型得到Worker的实例，才可以拿到数据进行比较。
		return this.name.equals(w.name) && this.age == w.age;
	}

//	@Override
//	public int hashCode() {
//		int result = name != null ? name.hashCode() : 0;
//		result = 31 * result + age;
//		return result;
//	}
}
