class Demo1DoWhile {
	/*
	A:循环结构do...while语句的格式：
* 
		do {
			循环体语句;
		}while(判断条件语句);
		
		完整格式；
		初始化语句;
		do {
			循环体语句;
			控制条件语句;
		}while(判断条件语句);
	*/
	public static void main(String[] args) {
		/*for (int x = 1;x <= 10 ;x++ ) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------------------");*/

		int y = 1;
		while (y < 0) {
			System.out.println(y);
			y++;
		}

		/*
		建议:
		当循环增量,只为了循环而定义的,建议for
		当循环增量,不只为了循环,循环结束之后,继续使用,建议while
		*/
		System.out.println("---------------------------------------");
		
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}
		while (x < 0);

		/*
		while和do while的区别
		while如果条件不满足,不执行循环体
		do while 无论条件是否满足,至少会执行一次循环体
		*/
	}
	/*
	三种循环的区别
	for while do while
	
	*/
}
