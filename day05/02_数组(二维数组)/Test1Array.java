class Test1Array {
	/*
	���󣺹�˾�����۶����
		ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
		��һ���ȣ�22,66,44
		�ڶ����ȣ�77,33,88
		�������ȣ�25,45,65
		���ļ��ȣ�11,66,99
	*/
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		
		int sum = 0;									//����һ������,�����ۼӲ���
		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y < arr[x].length ;y++ ) {
				sum = sum + arr[x][y];
			}
		}

		System.out.println(sum);
	}
}
