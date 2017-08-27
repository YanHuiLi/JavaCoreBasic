import java.util.Scanner;							//导入包
class Test1Scanner {
	public static void main(String[] args) {
		/*
		* A:案例演示
		* 键盘录入练习：键盘录入两个数据，并对这两个数据求和，输出其结果
		* B:案例演示
		* 键盘录入练习：键盘录入两个数据，获取这两个数据中的最大值
		*/
		Scanner sc = new Scanner(System.in);		//创建对象

		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();

		/*System.out.println("两个整数的和是:");
		int temp = x + y;
		System.out.println(temp);*/

		int result = (x > y) ? x : y;
		System.out.println("两个整数的最大值是:");
		System.out.println(result);
	}
}
