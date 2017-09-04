import java.util.Scanner;
class Demo8Array {
	/*
	数组查表法(根据键盘录入索引,查找对应星期)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//创建键盘录入对象
		System.out.println("请输入对应的星期,输入的数值在1-7之间:");
		int week = sc.nextInt();
		char c = getWeek(week);
		System.out.println("今天是星期" + c);
	}

	/*
	获取星期对应的值
	1,明确返回值类型char
	2,明确参数列表int week
	*/

	public static char getWeek(int week) {					//传入想要获取的星期
		char[] arr = {' ','一','二','三','四','五','六','日'};//定义表
		return arr[week];									//返回对应的星期
	}
}
