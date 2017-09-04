class Demo9Array {
	// 数组元素查找(查找指定元素第一次在数组中出现的索引)
	public static void main(String[] args) {
		int[] arr = {44,33,55,22,11,66};
		int index = getIndex(22,arr);
		System.out.println(index);
	}

	/*
	根据数组元素获取数组元素的索引
	1,明确返回值类型int
	2,明确参数列表,int key,int[] arr
	*/

	public static int getIndex(int key,int[] arr) {
		for (int x = 0;x < arr.length ;x++ ) {
			if (key == arr[x]) {
				return x;
			}
		}

		return -1;

	}
}
