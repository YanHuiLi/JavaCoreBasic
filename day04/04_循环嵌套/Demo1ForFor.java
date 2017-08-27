class Demo1ForFor {
	public static void main(String[] args) {
		
		/*for (int x = 1;x <= 3 ;x++ ) {			//外层循环

			//将下面所有的代码当作外层循环的循环体
			System.out.println("x = " + x);
			for (int y = 1;y <= 3 ;y++ ) {			//内层循环
				System.out.println("y = " + y);
			}
		}*/

		//需求：请输出一个4行5列的星星(*)图案。

		for (int x = 1;x <= 4 ;x++ ) {
			for (int y = 1;y <= 5 ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*****
*****
*****
*****

*/
