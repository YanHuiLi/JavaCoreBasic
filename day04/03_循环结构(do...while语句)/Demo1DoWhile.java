class Demo1DoWhile {
	/*
	A:ѭ���ṹdo...while���ĸ�ʽ��
* 
		do {
			ѭ�������;
		}while(�ж��������);
		
		������ʽ��
		��ʼ�����;
		do {
			ѭ�������;
			�����������;
		}while(�ж��������);
	*/
	public static void main(String[] args) {
		/*for (int x = 1;x <= 10 ;x++ ) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");*/

		int y = 1;
		while (y < 0) {
			System.out.println(y);
			y++;
		}

		/*
		����:
		��ѭ������,ֻΪ��ѭ���������,����for
		��ѭ������,��ֻΪ��ѭ��,ѭ������֮��,����ʹ��,����while
		*/
		System.out.println("---------------------------------------");
		
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}
		while (x < 0);

		/*
		while��do while������
		while�������������,��ִ��ѭ����
		do while ���������Ƿ�����,���ٻ�ִ��һ��ѭ����
		*/
	}
	/*
	����ѭ��������
	for while do while
	
	*/
}
