class Test2For99 {
	/*
	1 * 1 = 1
	1 * 2 = 2 2 * 2 = 4
	1 * 3 = 3 2 * 3 = 6 3 * 3 = 9

	����:
	1,99�˷���,��������,Ӧ����for��Ƕ��ѭ��,���ѭ����������,�ڲ�ѭ����������

	*/
	public static void main(String[] args) {
		for (int x = 1;x <= 9 ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {
				System.out.print(y  + "*" + x + "=" + (x * y)+ "\t");
			}

			System.out.print("\n");
		}
	}
}
