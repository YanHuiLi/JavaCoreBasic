class Demo3For {
	public static void main(String[] args) {
		// �������1-10֮������֮��
		/*
		����:
		1,Ӧ����һ������,��¼סÿ����ӵĺ�,��ʼ��ֵӦ����0,����sum
		2,����ѭ��,�ٶ���һ������,�����1�仯��10,������x
		3,�����ۼӲ���
		  0 + 1 = 1
				  1 + 2 = 3
				          3 + 3 = 6

		�ۼ�˼��
		*/

		int sum = 0;
		for (int x = 1; x <= 10;x++ ) {
			sum = sum + x;					//sum += x;
		}

		System.out.println(sum);
	}
}
