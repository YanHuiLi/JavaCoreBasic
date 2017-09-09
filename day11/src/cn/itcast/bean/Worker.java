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


	//��дtoString����
	public String toString() {
		return name + "," + age;
	}


	/*
	ԭʼ��equals�����Ƚϵı������ݵĵ�ַ��ʵ����û�ж�����塣
	  public boolean equals(Object obj) {
        	return (this == obj);
    	}
	*/

//	��дequals��������Ҫ�ǱȽ���������������Բ����ϣ�
	public boolean equals(Object obj) {	//Object obj = new Worker();
		Worker w = (Worker)obj;  //����ת�͵õ�Worker��ʵ�����ſ����õ����ݽ��бȽϡ�
		return this.name.equals(w.name) && this.age == w.age;
	}

//	@Override
//	public int hashCode() {
//		int result = name != null ? name.hashCode() : 0;
//		result = 31 * result + age;
//		return result;
//	}
}
