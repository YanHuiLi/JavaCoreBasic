//交换两个变量中的值
//int x = 10; int y = 5;
//做法1 引入第三方变量
//做法2 不允许用第三方变量
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
