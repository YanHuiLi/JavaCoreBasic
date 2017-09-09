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
}
