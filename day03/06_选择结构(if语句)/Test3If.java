import java.util.Scanner;
class Test3If {
	/*
	需求：键盘录入一个成绩，判断并输出成绩的等级。
		90-100 优
		80-89  良
		70-79  中
		60-69  及
		0-59   差
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//创建对象
		
		System.out.println("请输入一个成绩,范围是0到100之间:");
		int x = sc.nextInt();
		if(x >=90 && x <= 100) {
			System.out.println("优");
		}else if(x >= 80 && x < 90) {
			System.out.println("良");
		}else if(x >= 70 && x < 80) {
			System.out.println("中");
		}else if(x >= 60 && x < 70) {
			System.out.println("及");
		}else if(x >= 0 && x < 60) {
			System.out.println("差");
		}else {
			System.out.println("输入错误");
		}
	}
}
