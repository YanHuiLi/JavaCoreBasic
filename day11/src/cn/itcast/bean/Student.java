package cn.itcast.bean;

/**
 * 1.������һ��javaBean���󣬴��������ֶΣ�name��age
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
		System.out.println("ѧ���Է�");
	}
	
	public void sleep(){
		System.out.println("ѧ��˯��");
	}

	//	��дequals��������Ҫ�ǱȽ���������������Բ����ϣ�
	public boolean equals(Object obj) {	//Object obj = new Worker();
		Student s = (Student) obj;  //����ת�͵õ�Worker��ʵ�����ſ����õ����ݽ��бȽϡ�
		return this.name.equals(s.name) && this.age == s.age;
	}
	
	/*
	 *  public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
	 */
	
//	public String toString() {
//		return "�ҵ�������:" +  name  + ",�ҵ�������:" +  age;
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