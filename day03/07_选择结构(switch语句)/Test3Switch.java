import java.util.Scanner;

class Test3Switch {
	/*
	分别用switch语句和if语句实现下列需求：
	* 键盘录入月份，输出对应的季节
	3,4,5是春季,6,7,8是夏季,9,10,11是秋季,12,1,2是冬季
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份:");
		int month = sc.nextInt();
		/*switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month +"月是春季");
		break;
		case 6:
		case 7:
		case 8:
			System.out.println(month +"月是夏季");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println(month +"月是秋季");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println(month +"月是冬季");
		break;
		default:
			System.out.println("输入有误");
		}*/
		if(month > 12 || month < 1) {
			System.out.println("输入有误");
		}else if(month >= 3 && month <= 5) {
			System.out.println(month +"月是春季");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month +"月是夏季");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month +"月是秋季");
		}else {
			System.out.println(month +"月是冬季");
		}
	}
}


