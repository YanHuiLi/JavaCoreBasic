class Demo4Return {
	//return���������ز�����������
	public static void main(String[] args) {
		for (int x = 1;x <= 5 ;x++ ) {
			if (x == 4) {
				return;				//return�ǽ�������������
				//break;			//break�ǽ�ѭ������
			}

			System.out.println("x = " + x);
		}

		System.out.println("ѭ������");


	}
}
