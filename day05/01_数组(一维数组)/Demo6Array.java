class Demo6Array {
	public static void main(String[] args) {
		int[] arr = {44,55,66,33,77,11};
		int max = getMax(arr);
		System.out.println(max);
	}

	/*
	��ȡ�����е����ֵ
	1,��ȷ����ֵ����,int
	2,��ȷ�����б�,int[] arr
	*/

	public static int getMax(int[] arr) {
		int max = arr[0];								//���������¼ס��һ��λ�õ�ֵ

		for (int x = 1;x < arr.length ;x++ ) {			//��������,�ӵڶ���λ��
			if (arr[x] > max) {							//��max�е�ֵ�Ƚ�,�����maxֵ��
				max = arr[x];							//��max�е�ֵ�滻��
			}
		}

		return max;										//�����ֵ����
	}
}
