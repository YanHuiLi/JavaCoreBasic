package cn.itcast.eclipse;

import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 * ctrl + d ����ɾ��
	 * ctrl + 1  ������
	 * ctrl + shift + t ���Ҿ������
	 * ctrl + o �����в��Ҿ���ķ���
	 * ctrl + n �����µ����ӿ�
	 * alt + shift + m ��ȡ����
	 * alt + shift + r ����
	 */
	public static void main(String[] args) {
		//print();
		int a = 10;
		int y = 20;
		int sum = add(a,y);
		
	}

	private static int add(int x, int y) {
		
		return x + y;
	}

	public static void print() {
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
	}
	

}
