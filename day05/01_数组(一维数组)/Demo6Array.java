class Demo6Array {
	public static void main(String[] args) {
		int[] arr = {44,55,66,33,77,11};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	获取数组中的最大值
	1,明确返回值类型,int
	2,明确参数列表,int[] arr
	*/

	public static int getMax(int[] arr) {
		int max = arr[0];								//定义变量记录住第一个位置的值

		for (int x = 1;x < arr.length ;x++ ) {			//遍历数组,从第二个位置
			if (arr[x] > max) {							//与max中的值比较,如果比max值大
				max = arr[x];							//将max中的值替换掉
			}
		}

		return max;										//将最大值返回
	}
}
