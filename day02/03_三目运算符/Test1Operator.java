class Test1Operator {
	public static void main(String[] args) {
		/*
			A:������ʾ
			�Ƚ����������Ƿ���ͬ
			B:������ʾ
			��ȡ���������е����ֵ
		
		
		int x = 10;
		int y = 10;
		boolean b = (x == y)? true : false;
		boolean b2 = (x == y);

		System.out.println(b);*/

		int a = 10;
		int b = 20;
		int c = 30;

		int temp = (a > b) ? a : b;
		//System.out.println((temp > c) ? temp : c);
		int temp2 = (temp > c) ? temp : c;
	}
}
