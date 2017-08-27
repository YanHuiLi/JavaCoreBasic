class Test1Method {

	/*
	* A:案例演示
	* 需求：比较两个数据是否相等。参数类型分别为两个byte类型，
	* 两个short类型，两个int类型，两个long类型，并在main方法中进行测试
	*/
	public static void main(String[] args) {
		/*byte b1 = 3;
		byte b2 = 4;
		boolean b3 = isEquals(b1,b2);
		System.out.println(b3);*/

		int x = 1;
		while (x <= 10000);						//屌丝被女神拒绝
		
		{
			System.out.println("I Love You!!!!");
			x++;
		}
	}

	//比较两个byte类型
	public static boolean isEquals(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}

	//比较两个short类型
	public static boolean isEquals(short a,short b) {
		System.out.println("short");
		return a == b;
	}

	//比较两个int类型
	public static boolean isEquals(int a,int b) {
		System.out.println("int");
		return a == b;
	}

	//比较两个long类型
	public static boolean isEquals(long a,long b) {
		System.out.println("long");
		return a == b;
	}
}
