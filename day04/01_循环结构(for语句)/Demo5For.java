class Demo5For {
	//����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
	/*
	������˼��(ͳ��˼��)
	����:
	1,����һ������,��¼ˮ�ɻ������ֵĸ���
	*/
	public static void main(String[] args) {
		int count = 0;
		for (int x = 100;x < 1000 ;x++ ) {
			int ge = x % 10;			//153 % 10 = 3
			int shi = x / 10 % 10;		//153 / 10 = 15 % 10 = 5
			int bai = x / 10 / 10 % 10;//153 / 10 = 15 / 10 = 1 % 10 = 1

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x ) {
				count++;				//count = count + 1;
			}
		}

		System.out.println(count);
	}
}
