class Test1ForFor {
	/*
	 A:������ʾ
* 
		������������е���״
		*
		**
		***
		****
		*****

		*****
		****
		***
		**
		*
	����:
	1,���ͼ����������,�뵽for��Ƕ��ѭ��,���ѭ����������,�ڴ�ѭ����������
	2,���ѭ������β���,�ڲ�ѭ����1�仯��5
	*/
	public static void main(String[] args) {
		/*for (int x = 1;x <= 5 ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {			//x ��1�仯��5
				System.out.print("*");
			}
			System.out.println();
		}*/

		for (int x = 1;x <= 5 ;x++ ) {
			for (int y = x;y <= 5 ;y++ ) {			//x ��1�仯��5
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	*****
	****
	***
	**
	*
	*/
}
