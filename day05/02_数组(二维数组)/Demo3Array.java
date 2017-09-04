class Demo3Array {
	public static void main(String[] args) {
		//int[][] arr = new int[3][2];				//第一种格式
		int[][] arr = new int[3][];					//第二种格式
		arr[0] = new int[5]; //初始化一维数组的长度，更加灵活
		arr[1] = new int[6];
		arr[2] = new int[7];
		System.out.println(arr[0]);
	}
}
