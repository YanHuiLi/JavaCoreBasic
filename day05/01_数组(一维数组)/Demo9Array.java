class Demo9Array {
	// ����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
	public static void main(String[] args) {
		int[] arr = {44,33,55,22,11,66};
		int index = getIndex(22,arr);
		System.out.println(index);
	}

	/*
	��������Ԫ�ػ�ȡ����Ԫ�ص�����
	1,��ȷ����ֵ����int
	2,��ȷ�����б�,int key,int[] arr
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
