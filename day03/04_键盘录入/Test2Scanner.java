import java.util.Scanner;							//导入包
class Test2Scanner {
	public static void main(String[] args) {
		/*
		* A:案例演示
		* 键盘录入练习：键盘录入两个数据，比较这两个数据是否相等
		* B:案例演示
		* 键盘录入练习：键盘录入三个数据，获取这三个数据中的最大值
		*/

		Scanner sc = new Scanner(System.in);		//创建对象

		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();

		/*boolean b = (x == y);
		System.out.println(b);*/
		System.out.println("请输入第三个整数:");
		int z = sc.nextInt();

		int temp = (x > y) ? x : y;
		int temp2 = (temp > z) ? temp : z;
		System.out.println("三个整数的最大值是:" + temp2);
	}
}
