class Test1For {
	public static void main(String[] args) {
		//������1-100֮��
		/*int sum = 0;
		for (int x = 1;x <= 100 ;x++ ) {
			sum = sum + x;
		}
		System.out.println(sum);*/
		
		//�������1-100֮��ż����
		/*
		����
		1,����һ������,��¼ס���������ܺ�
		2,����һ��ѭ��,�ٶ���һ����������,��ʼ��ֵΪ2,ÿ����2
		3,�ۼ�����
		*/
		/*int sum = 0;
		for (int x = 2;x <= 100 ;x += 2 ) {
			sum = sum + x;
		}

		for (int x = 1;x <= 100 ;x++ ) {
			if (x % 2 == 0) {
				sum = sum + x;
			}
		}
		System.out.println(sum);*/
		//�������1-100֮��������

		int sum = 0;
		/*for (int x = 1;x <= 100 ;x += 2 ) {
			sum = sum + x;
		}*/

		for (int x = 1;x <= 100 ;x++ ) {
			if (x % 2 == 1) {
				sum = sum + x;
			}
		}
		System.out.println(sum);
	}
}
