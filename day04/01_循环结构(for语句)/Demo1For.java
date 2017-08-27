class Demo1For {
	/*
	初始化语句：
	一条或者多条语句，这些语句完成一些初始化操作。

	判断条件语句：
	这是一个boolean 表达式，这个表达式能决定是否执行循环体。

	循环体语句：
	这个部分是循环体语句，也就是我们要多次做的事情。

	控制条件语句：
	这个部分在一次循环体结束后，下一次循环判断条件执行前执行。
	通过用于控制循环条件中的变量，使得循环在合适的时候结束。

	for(初始化语句;判断条件语句;控制条件语句) {
         循环体语句;
    }

	*/
	public static void main(String[] args) {
		//在控制台输出10次”HelloWorld”
		/*System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");*/

		for(int x = 1; x <= 10;x++) {					//第一次执行的是初始化语句int x = 1;初始化语句只执行一次
														//第二次执行的是判断语句 x <= 10;
														//第三次执行的是循环语句 System.out.println("HelloWorld");
														//第四次执行的是控制语句 x++;
														//第五次执行判断语句(2,3,4之间不断循环,直到2返回的false)
			System.out.println("HelloWorld");
		}

		System.out.println("for循环结束");
	}
}
