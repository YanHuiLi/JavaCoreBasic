package cn.itcast.object;

import cn.itcast.eclipse.Person;

public class Demo2GetClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person("����",23);
		Class clazz = p.getClass();			//���ش˶��������ʱ��
		String name = clazz.getName();		//���������������
		System.out.println(name);
	}

}
