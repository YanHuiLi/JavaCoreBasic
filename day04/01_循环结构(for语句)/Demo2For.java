class Demo2For {
	public static void main(String[] args) {
		//需求：请在控制台输出数据1-10
		/*
		1,开始从1开始,定义一个初始化变量等于1
		2,结束是到10结束,定义判断语句小于等于10
		3,控制语句每次增加1就可以
		4,循环语句直接将变量x输出就可以
		*/

		/*for (int x = 1;x <= 10 ;x++ ) {
			System.out.println(x);
		}*/

		//System.out.println(x);			x在for语句执行完,就会被释放掉,所以下面可以继续定义x变量
		//需求：请在控制台输出数据10-1
		for (int x = 10;x >= 1 ;x-- ) {
			System.out.println(x);
		}
		
		//有左大括号不要有分号
		int x = 5;
		for (x = 10;x >= 1 ;x-- );			//x-- 相当于 x= x -1
			
		{
			System.out.println(x);
		}

		System.out.println(x);

	}
}
