class Demo7Array {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};					//0x0088

		/*for (int x = 0;x < arr.length ;x++ ) {			//�������
			System.out.println(arr[x]);
		}

		for (int x = arr.length - 1;x >= 0 ;x-- ) {		//�������
			System.out.println(arr[x]);
		}*/

		revArray(arr);									//�����鷴ת����
		print(arr);										//������ӡ����
	}

	/*
	�����鷴ת
	1,����ֵ����void
	2,�����б�,int[] arr
	*/

	public static void revArray(int[] arr) {			//arr = 0x0088
		for (int x = 0;x < arr.length / 2 ; x++) {
			int temp = arr[x];
			arr[x] = arr[arr.length-1-x];
			arr[arr.length-1-x] = temp;
		}
	}													//55,44,33,22,11

	/*
	�������ӡ
	1,����ֵ����void
	2,�����б�,int[] arr
	*/

	public static void print(int[] arr) {
		for (int x = 0;x < arr.length ;x++ ) {
			System.out.print(arr[x] + " ");
		}
	}
}
