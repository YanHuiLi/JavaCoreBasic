class Demo2Method {
	public static void main(String[] args) {
		//int sum = getSum(4,5);			//��ֵ����
		//System.out.println(sum);
		//����(���⾫����,�ðײ�,������,�ع���);
		//�о��巵��ֵ
		//getSum(4,5);						//�������ò��Ƽ�
		System.out.println(getSum(4,5));	//�������,��ʱ���Ƽ�,���㿴����

		//return;							//��������ķ���ֵ������void,��return���������д��return;
											//���return����ʡ��,ʡ��֮��jvm����Ҽ���
	}

	/*
	�����������ĺ�
	1,��ȷ����ֵ����
	2,��ȷ�����б�
	*/

	public static int getSum(int x,int y) {//int x = 4,int y = 5
		int sum = x + y;					// sum = 9

		return sum;
	}

	/*
	���� ����(��,��,��,��) {
		���˵Ķ���;
		return һ�̲�;
	}
	*/
}
