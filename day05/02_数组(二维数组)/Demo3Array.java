class Demo3Array {
	public static void main(String[] args) {
		//int[][] arr = new int[3][2];				//��һ�ָ�ʽ
		int[][] arr = new int[3][];					//�ڶ��ָ�ʽ
		arr[0] = new int[5]; //��ʼ��һά����ĳ��ȣ��������
		arr[1] = new int[6];
		arr[2] = new int[7];
		System.out.println(arr[0]);
	}
}
