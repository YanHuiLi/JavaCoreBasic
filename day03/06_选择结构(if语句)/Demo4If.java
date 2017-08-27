class Demo4If {
	/*
	* A:案例演示
	* 需求：获取三个数据中的最大值
	* if语句的嵌套使用。
	* 可以三元实现，也可以if嵌套实现。
	*/
	public static void main(String[] args) {
		int x = 30;
		int y = 20;
		int z = 10;

		/*if(x > y) {
			if(x > z) {
				System.out.println(x);
			}else {
				System.out.println(z);
			}
		}else {
			if(y > z) {
				System.out.println(y);
			}else {
				System.out.println(z);
			}
		}*/

		//int temp = (x > y) ? x : y  > z ? ((x > y) ? x : y) : z;三元运算符号可以嵌套,但是强烈不建议
	}
}
