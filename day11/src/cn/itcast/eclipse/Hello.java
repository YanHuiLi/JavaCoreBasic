package cn.itcast.eclipse;

import cn.itcast.bean.Student;
import cn.itcast.bean.Tool;

/*
 */
public class Hello {
	public static void main(String[] args) {
		//print();
		Tool t = new Tool();
		t.method();
	}

	public static void print() {
		Student stu = new Student("����", 23);
		stu.setName("����");
		stu.setAge(24);
		
		System.out.println(stu.getName() + "," + stu.getAge());
	}
}
