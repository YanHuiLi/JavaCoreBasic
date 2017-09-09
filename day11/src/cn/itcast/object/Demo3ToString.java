package cn.itcast.object;

import cn.itcast.bean.Student;

public class Demo3ToString {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Student s = new Student("张三", 23);
    System.out.println("我的姓名是:" + s.getName() + ",我的年龄是:" + s.getAge());

    System.out.println(s);
  }
  /*
	 *  public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
	 * */

}
