class Demo2For {
	public static void main(String[] args) {
		//�������ڿ���̨�������1-10
		/*
		1,��ʼ��1��ʼ,����һ����ʼ����������1
		2,�����ǵ�10����,�����ж����С�ڵ���10
		3,�������ÿ������1�Ϳ���
		4,ѭ�����ֱ�ӽ�����x����Ϳ���
		*/

		/*for (int x = 1;x <= 10 ;x++ ) {
			System.out.println(x);
		}*/

		//System.out.println(x);			x��for���ִ����,�ͻᱻ�ͷŵ�,����������Լ�������x����
		//�������ڿ���̨�������10-1
		for (int x = 10;x >= 1 ;x-- ) {
			System.out.println(x);
		}
		
		//��������Ų�Ҫ�зֺ�
		int x = 5;
		for (x = 10;x >= 1 ;x-- );			//x-- �൱�� x= x -1
			
		{
			System.out.println(x);
		}

		System.out.println(x);

	}
}
