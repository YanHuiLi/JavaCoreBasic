class Demo1Break {
	public static void main(String[] args) {
		int y = 4;
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == y) {
				break;							//����ѭ��,����ĳ������,������
			}
			System.out.println("x = " + x);
		}
	}
}
