class Test2For99 {
	/*
	1 * 1 = 1
	1 * 2 = 2 2 * 2 = 4
	1 * 3 = 3 2 * 3 = 6 3 * 3 = 9

	分析:
	1,99乘法表,有行有列,应该用for的嵌套循环,外层循环决定行数,内层循环决定列数

	*/
	public static void main(String[] args) {
		for (int x = 1;x <= 9 ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {
				System.out.print(y  + "*" + x + "=" + (x * y)+ "\t");
			}

			System.out.print("\n");
		}
	}
}
