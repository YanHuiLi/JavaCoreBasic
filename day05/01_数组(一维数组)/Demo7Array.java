class Demo7Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};					//0x0088

		/*for (int x = 0;x < arr.length ;x++ ) {			//正序遍历
			System.out.println(arr[x]);
		}

		for (int x = arr.length - 1;x >= 0 ;x-- ) {		//倒序遍历
			System.out.println(arr[x]);
		}*/

		revArray(arr);									//对数组反转操作
		print(arr);										//遍历打印数组
	}

	/*
	将数组反转
	1,返回值类型void
	2,参数列表,int[] arr
	*/

	public static void revArray(int[] arr) {			//arr = 0x0088
		for (int x = 0;x < arr.length / 2 ; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}													//55,44,33,22,11

	/*
	将数组打印
	1,返回值类型void
	2,参数列表,int[] arr
	*/

	public static void print(int[] arr) {
		for (int x = 0;x < arr.length ;x++ ) {
			System.out.print(arr[x] + " ");
		}
	}
}
