class Demo5For {
	//需求：统计”水仙花数”共有多少个
	/*
	计数器思想(统计思想)
	分析:
	1,定义一个变量,记录水仙花数出现的个数
	*/
	public static void main(String[] args) {
		int count = 0;
		for (int x = 100;x < 1000 ;x++ ) {
			int ge = x % 10;			//153 % 10 = 3
			int shi = x / 10 % 10;		//153 / 10 = 15 % 10 = 5
			int bai = x / 10 / 10 % 10;//153 / 10 = 15 / 10 = 1 % 10 = 1

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x ) {
				count++;				//count = count + 1;
			}
		}

		System.out.println(count);
	}
}
