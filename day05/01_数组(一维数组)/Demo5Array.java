class Demo5Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		System.out.println(arr.length);			//数组名.length代表数组的长度
		/*for (int x = 0;x < 5 ;x++ ) {
			System.out.print(arr[x] + " ");
		}*/

		//arr.length;

		for (int x = 0;x < arr.length ;x++ ) {	//一维数组的遍历操作
			System.out.print(arr[x] + " ");
		}
	}
}
