class Demo6Method {
	//��������,ֻ�������б�,��������ֵ����
	/*
	1,����������ͬ
	2,�������Ͳ�ͬ
	3,����˳��ͬ(����ʱ������)
	*/
	public static void main(String[] args) {
		double sum = getSum(3,4.0);
		System.out.println(sum);
	}

	//���������ĺ�
	/*
	1,int
	2,int a,int b
	*/

	public static double getSum(int a,double b) {
		return a + b;
	}

	//���������ĺ�
	/*
	1,int
	2,int a,int b,int c
	*/

	public static double getSum(double a,int b) {
		return a + b;
	}

}
