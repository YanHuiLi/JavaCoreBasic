import java.util.Scanner;
class Demo5Method {
	//需求：根据键盘录入的数据输出对应的乘法表
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建对象
		System.out.println("请输入一个整数");
		int x = sc.nextInt();

		print99(x);
	}

	/*
	打印99乘法表
	1,明确返回值类型void
	2,明确参数列表int a
	*/

	public static void print99(int a) {
		for (int x = 1;x <= a ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {
				System.out.print(y +"*" + x + "=" + (y * x) + "\t");
			}

			System.out.println();
		}
	}
}
