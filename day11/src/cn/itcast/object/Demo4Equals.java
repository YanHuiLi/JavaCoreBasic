package cn.itcast.object;

import cn.itcast.bean.Worker;

import java.util.HashMap;

public class Demo4Equals {

	/**2
	 * @param args
	 * alt + ctrl + �¼� ���¸���һ��
	 */
	public static void main(String[] args) {
		Worker w1 = new Worker("����", 23);
		Worker w2 = new Worker("����", 23);
		boolean b = w2.equals(w1);
		boolean b1 = w2==w1;
		System.out.println(b);
		System.out.println(b1);

		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode());
		//Object obj = w2;����ת��

		//Worker w3 = w2;
		//System.out.println(w2.equals(w3));

		HashMap<Worker ,String> hashMap= new HashMap<>();
		Worker w11 = new Worker("����", 23);
		System.out.println(w1.equals(w11));

		hashMap.put(w1,"����");
		System.out.println(hashMap.get(w1));
		System.out.println(hashMap.get(w11));
	}
	/*
	 *  public boolean equals(Object obj) {
        	return (this == obj);
    	}
	 */
}
