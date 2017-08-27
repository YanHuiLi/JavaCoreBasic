class Demo1Break {
	public static void main(String[] args) {
		int y = 4;
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == y) {
				break;							//跳出循环,满足某种条件,再跳出
			}
			System.out.println("x = " + x);
		}
	}
}
