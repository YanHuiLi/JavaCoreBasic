class Demo1Method {
	/*
	���η� ����ֵ���� ������(�������� ������1���������� ������2��) {
			������;
			return ����ֵ;
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
