class Demo4Array {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		//System.out.println(arr1[-1]);			//ArrayIndexOutOfBoundsException:��������Խ���쳣
		System.out.println(arr1);				//[I@1afb7ac7
		arr1 = null;							//�����鸳ֵΪnull
		System.out.println(arr1[0]);			//NullPointerException:��ָ���쳣
	}
}
