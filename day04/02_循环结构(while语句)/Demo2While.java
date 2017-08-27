class Demo2While {
	public static void main(String[] args) {
		//求1-100之和
		/*int x = 1;
		int sum = 0;
		while (x <= 100) {
			sum = sum + x;
			x++;
		}

		System.out.println(sum);*/

		//求水仙花数的个数
		int count = 0;
		int x = 100;
		while (x < 1000) {
			int ge = x % 10;
			int shi = x / 10 % 10;
			int bai = x / 100;

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == x) {
				count++;
			}

			x++;
		}

		System.out.println(count);
	}
}
