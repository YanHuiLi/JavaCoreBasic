
import java.util.Scanner;							//导入包

class Demo1Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建对象,键盘录入
		System.out.println("请输入第一个整数");
		int x = sc.nextInt();						//录入一个int类型的整数
		System.out.println(x);
		System.out.println("请输入第二个整数");
		int y = sc.nextInt();
		System.out.println(y);
	}
}
