package cn.itcast.object;

import cn.itcast.eclipse.Person;

public class Demo2GetClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("张三",23);
		Class clazz = p.getClass();			//返回此对象的运行时类
		String name = clazz.getName();		//这个对象所属类名
		System.out.println(name);
	}

}
