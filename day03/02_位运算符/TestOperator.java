//�������������е�ֵ
//int x = 10; int y = 5;
//����1 �������������
//����2 �������õ���������
class TestOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		/*int temp;

		temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x + ",y = " + y);

		x = x + y;		//10 + 5 = 15
		y = x - y;		//15 - 5 = 10
		x = x - y;		//15 - 10 = 5
		System.out.println("x = " + x + ",y = " + y);*/

		x = x ^ y;		// 10 ^ 5
		y = x ^ y;		// 10 ^ 5 ^ 5 = 10
		x = x ^ y;		// 10 ^ 5 ^ 10 = 5
		System.out.println("x = " + x + ",y = " + y);
	}
}
