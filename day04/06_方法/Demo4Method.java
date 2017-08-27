import java.util.Scanner;
class Demo4Method {
	/*
	* A:案例演示
	* 需求：根据键盘录入的行数和列数，在控制台输出星形
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建对象
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();
		System.out.println("请输入第二个整数");
		int y = sc.nextInt();

		//print(x,y);									//如果返回值是void,可以直接调用
		//System.out.println(print(x,y));				//返回值是void的方法是不能打印输出
	}

	/*
	定义方法打印矩形
	1,明确返回值类型,void,无法明确具体返回值类型
	2,明确参数列表,int a,int b
	*/

	public static void print(int a,int b) {
		for (int x = 1;x <= a ;x++ ) {
			for (int y = 1;y <= b ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
