class Demo4Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};		//��ά����ĵ����ָ�ʽ

		//System.out.println(arr.length);				//����һά����ĸ���
		//��ά����ı���
		for (int x = 0;x < arr.length ;x++ ) {			//���ѭ����ȡ��ÿһ��һά����
			//arr[x]  arr[0] arr[1] arr[2]
			for (int y = 0;y < arr[x].length ;y++ ) {
				System.out.print(arr[x][y] + " ");
			}

			System.out.println();
		}
	}
}
