class Demo1Method {
	/*
	修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			函数体;
			return 返回值;
    }

	*/
	public static void main(String[] args) {
		/*for (int x = 1;x <= 5 ;x++ ) {
			for (int y = 1;y <= 5 ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------------");

		for (int x = 1;x <= 6 ;x++ ) {
			for (int y = 1;y <= 6 ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}*/

		print(4);
		print(5);
		print(6);

	}

	public static void print(int i) {				//i = 4
		for (int x = 1;x <= i ;x++ ) {
			for (int y = 1;y <= i ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
