package cn.itcast.eclipse;

public class Person {
	private String name;
	private int age;
	public Person() {						//alt + shift + s 再加c(根据父类生成构造方法)
		super();
		
	}
	public Person(String name, int age) {	//alt + shift + s 再加o(根据本类字段生成构造方法)
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {				//alt + shift + s 再加r(根据本类字段生成get和set方法)	
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
	
}
