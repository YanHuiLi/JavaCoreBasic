class Test1For {
	public static void main(String[] args) {
		//需求：求1-100之和
		/*int sum = 0;
		for (int x = 1;x <= 100 ;x++ ) {
			sum = sum + x;
		}
		System.out.println(sum);*/
		
		//需求：求出1-100之间偶数和
		/*
		分析
		1,定义一个变量,记录住最后运算的总和
		2,定义一个循环,再定义一个变量自增,初始化值为2,每次增2
		3,累加运算
		*/
		/*int sum = 0;
		for (int x = 2;x <= 100 ;x += 2 ) {
			sum = sum + x;
		}

		for (int x = 1;x <= 100 ;x++ ) {
			if (x % 2 == 0) {
				sum = sum + x;
			}
		}
		System.out.println(sum);*/
		//需求：求出1-100之间奇数和

		int sum = 0;
		/*for (int x = 1;x <= 100 ;x += 2 ) {
			sum = sum + x;
		}*/

		for (int x = 1;x <= 100 ;x++ ) {
			if (x % 2 == 1) {
				sum = sum + x;
			}
		}
		System.out.println(sum);
	}
}
