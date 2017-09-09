package cn.itcast.eclipse;

import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 * ctrl + d 整行删除
	 * ctrl + 1  给建议
	 * ctrl + shift + t 查找具体的类
	 * ctrl + o 在类中查找具体的方法
	 * ctrl + n 创建新的类或接口
	 * alt + shift + m 抽取方法
	 * alt + shift + r 改名
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
