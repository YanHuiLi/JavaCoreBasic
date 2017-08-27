class Demo3For {
	public static void main(String[] args) {
		// 需求：求出1-10之间数据之和
		/*
		分析:
		1,应该有一个变量,记录住每次相加的和,初始化值应该是0,变量sum
		2,定义循环,再定义一个变量,让其从1变化到10,变量名x
		3,进行累加操作
		  0 + 1 = 1
				  1 + 2 = 3
				          3 + 3 = 6

		累加思想
		*/

		int sum = 0;
		for (int x = 1; x <= 10;x++ ) {
			sum = sum + x;					//sum += x;
		}

		System.out.println(sum);
	}
}
