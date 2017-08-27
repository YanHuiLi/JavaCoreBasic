class Demo4Return {
	//return是用来返回并结束方法的
	public static void main(String[] args) {
		for (int x = 1;x <= 5 ;x++ ) {
			if (x == 4) {
				return;				//return是将整个方法结束
				//break;			//break是将循环结束
			}

			System.out.println("x = " + x);
		}

		System.out.println("循环结束");


	}
}
