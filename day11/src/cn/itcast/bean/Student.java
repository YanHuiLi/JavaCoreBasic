package cn.itcast.bean;

/**
 * 1.定义了一个javaBean对象，存有两个字段，name和age
 *
 */
public class Student {
	private String name;
	private int age;
	public Student() {
		super();
		
	}
	public Student(String name, int age) {
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
	
	public void eat() {
		System.out.println("学生吃饭");
	}
	
	public void sleep(){
		System.out.println("学生睡觉");
	}

	//	重写equals方法，主要是比较内容里面的区别（仍不晚上）
	public boolean equals(Object obj) {	//Object obj = new Worker();
		Student s = (Student) obj;  //向下转型得到Worker的实例，才可以拿到数据进行比较。
		return this.name.equals(s.name) && this.age == s.age;
	}
	
	/*
	 *  public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
	 */
	
//	public String toString() {
//		return "我的姓名是:" +  name  + ",我的年龄是:" +  age;
//	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//
//		Student student = (Student) o;
//
//		if (age != student.age) return false;
//		return name.equals(student.name);
//	}

//	@Override
//	public int hashCode() {
//		int result = name.hashCode();
//		result = 31 * result + age;
//		return result;
//	}
}