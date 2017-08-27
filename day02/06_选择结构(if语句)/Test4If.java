import java.util.Scanner;
class Test4If {
	/*
	* 需求：
		* 键盘录入x的值，计算出y的并输出。
		
		* x>=3	y = 2 * x + 1;
		* -1<x<3	y = 2 * x;
		* x<=-1	y = 2 * x – 1;
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x = sc.nextInt();
		int y;
		if(x >= 3) {
			y = 2 * x + 1;
			System.out.println(y);
		}else if(x > -1 && x < 3) {
			y = 2 * x;
			System.out.println(y);
		}else if(x <= -1) {
			y = 2 * x - 1;
			System.out.println(y);
		}
	}
}
