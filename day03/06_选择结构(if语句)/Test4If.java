import java.util.Scanner;
class Test4If {
	/*
	* ����
		* ����¼��x��ֵ�������y�Ĳ������
		
		* x>=3	y = 2 * x + 1;
		* -1<x<3	y = 2 * x;
		* x<=-1	y = 2 * x �C 1;
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
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
