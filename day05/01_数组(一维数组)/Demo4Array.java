class Demo4Array {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		//System.out.println(arr1[-1]);			//ArrayIndexOutOfBoundsException:数组索引越界异常
		System.out.println(arr1);				//[I@1afb7ac7
		arr1 = null;							//将数组赋值为null
		System.out.println(arr1[0]);			//NullPointerException:空指针异常
	}
}
