package cn.itcast.eclipse;

public class Person {
	private String name;
	private int age;
	public Person() {						//alt + shift + s �ټ�c(���ݸ������ɹ��췽��)
		super();
		
	}
	public Person(String name, int age) {	//alt + shift + s �ټ�o(���ݱ����ֶ����ɹ��췽��)
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {				//alt + shift + s �ټ�r(���ݱ����ֶ�����get��set����)	
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
