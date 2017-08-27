class Demo6Method {
	//方法重载,只看参数列表,不看返回值类型
	/*
	1,参数个数不同
	2,参数类型不同
	3,参数顺序不同(开发时不建议)
	*/
	public static void main(String[] args) {
		double sum = getSum(3,4.0);
		System.out.println(sum);
	}

	//求两个数的和
	/*
	1,int
	2,int a,int b
	*/

	public static double getSum(int a,double b) {
		return a + b;
	}

	//求三个数的和
	/*
	1,int
	2,int a,int b,int c
	*/

	public static double getSum(double a,int b) {
		return a + b;
	}

}
