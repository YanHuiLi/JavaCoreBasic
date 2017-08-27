class Demo1Operator {
	public static void main(String[] args) {
		//格式(关系表达式)?表达式1：表达式2；
		int x = 10;
		int y = 5;
		int z = (x > y) ? x : y;	//如果条件为真,就把表达式1的值赋值过去,如果条件为假就把表达式2的值赋值过去

		System.out.println(z);
	}
}
