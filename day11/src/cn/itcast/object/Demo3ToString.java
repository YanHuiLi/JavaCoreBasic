package cn.itcast.object;

import cn.itcast.bean.Student;

public class Demo3ToString {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Student s = new Student("����", 23);
    System.out.println("�ҵ�������:" + s.getName() + ",�ҵ�������:" + s.getAge());

    System.out.println(s);
  }
  /*
	 *  public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
	 * */

}
