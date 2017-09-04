class Demo1Array {
	public static void main(String[] args) {
		//声明数组
		//int[] arr1;							//数据类型[] 数组名; 推荐
		//int arr2[];							//数据类型 数组名[];

		//动态初始化,没有给数组赋具体的值
		int[] arr = new int[5];					//new是一个关键字,用来创建实体对象
												//5代表数组的长度

		arr[0] = 5;

		arr[4] = 10;
		
		//静态初始化
		int[] arr2 = new int[]{1,2,3};			//静态初始化,不用知道数组长度,长度根据元素个数

	}
}
