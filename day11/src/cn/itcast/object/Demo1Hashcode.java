package cn.itcast.object;

import cn.itcast.bean.Student;
import cn.itcast.eclipse.Person;



import java.util.HashMap;

public class Demo1Hashcode {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Object obj = new Object();
    int x = obj.hashCode();
    System.out.println(x);
      Student student= new Student("张三",123);
      System.out.println(student.hashCode());
      Student student1= new Student("张三",123);
      System.out.println(student1.hashCode());
      System.out.println(student.equals(student1));

    if (student==student1) {
      System.out.println("student= student1");
    }else {
      System.out.println("student!= student1");
    }

    if (student.equals(student1)) {
      System.out.println("student= student1");
    }else {
      System.out.println("student!= student1");
    }
     int x1=1;
    int x2=2;
    if (x1==x2){

    }


    String s = EqualsHashmap();
    System.out.println(s);
  }

  public static String EqualsHashmap(){
    HashMap<Person,String> hashMap= new HashMap<>();
     hashMap.put(new Person("Tom", 23),"Tom");
    String tom = hashMap.get(new Person("Tom", 23));
    System.out.println();

    return tom;
  }



}
