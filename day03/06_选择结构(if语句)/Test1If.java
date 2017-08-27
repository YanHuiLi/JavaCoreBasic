import java.util.Scanner;
class Test1If {
	/*
		a:获取两个数据中较大的值
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建对象
		System.out.println("请输入第一个整数:");
		int x = sc.nextInt();						//将键盘录入的整数存储在x中
		System.out.println("请输入第二个整数:");
		int y = sc.nextInt();						//将键盘录入的整数存储在y中

		int z;
		if(x > y) {
			//System.out.println(x);
			z = x;
		}else {
			//System.out.println(y);
			z = y;
		}

		int z = (x > y) ? x : y;
	}

	/*
	if else 和三元运算符号的区别
	如果仅仅是赋值,他俩没区别,建议用三元运算符
	如果想有输出语句或其他更复杂的语句,只能用if else
	*/
}
