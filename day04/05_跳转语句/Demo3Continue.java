class Demo3Continue {
	public static void main(String[] args) {
		/*for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				continue;				//终止本次循环,继续下次循环
				//break;
			}

			System.out.println("x = " + x);
		}*/

		int x = 10;
		if (x > 4) {
			System.out.println("x = " + x);
			//break;
		}

		/*
		break和continue的应用场景
		break可以应用在switch语句还可以应用在循环里
		continue只能用在循环里
		*/
	}
}
