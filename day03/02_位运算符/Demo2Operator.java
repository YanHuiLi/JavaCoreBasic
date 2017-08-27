class Demo2Operator {
	public static void main(String[] args) {
		System.out.println(-6 >> 1);			//向右移动几次就是除以2的几次幂
		//System.out.println(6 << 1);			//向左移动几次就是乘以2的几次幂
	/*
	>>>无符号右移和>>有符号右移的区别
	>>>无符号右移无论高位是0还是1,移动后都用0补位
	>>有符号右移高位是0就补0,高位是1就补1
	*/

	//面试题
	//请用最有效率的方式写出计算2乘以8的结果
		System.out.println(2 * 8);
		System.out.println(2 << 3);				//最有效率,直接操作的是二进制
	}
}
