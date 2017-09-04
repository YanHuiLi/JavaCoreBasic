/*
小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
*/
class Test1 {
	public static void main(String[] args) {
		/*int result = 100;
		double sum = 0;
		int day = 1;
		double dayMoney = 2.5;

		while (true) {
			sum = sum + dayMoney;
			if (day % 5 == 0) {
				sum = sum - 6;
			}

			if (sum >= result) {
				System.out.println("小芳用了" + day + "天存了100元钱");
				break;
			}else {
				day++;
			}
		}*/

		int[][] arr = new int[6][6];
		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y < arr.length ;y++ ) {
				arr[x][0] = 1;
				arr[x][x] = 1;
			}
		}
		/*
		1 0 0 0
		1 1 0 0
		1 2 1 0
		1 3 3 1
		*/
		for (int x = 2;x < arr.length ;x++ ) {
			for (int y = 1;y <= x -1 ;y++ ) {
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}

		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y <=x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}

		/*
		2:数据加密问题
		某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
		在传递过程中需要加密，加密规则如下：
		首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
		最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
		然后，把加密后的结果在控制台打印出来。
		*/

/*int sum = 100;// 最终的目标
double db = 2.5;// 每次存放的钱数
int day = 1;// 天数
double dsum = 0;// 每次存放的总数
while (true) {
	dsum = dsum + db;// 返回每天都存放钱的总和
	if (day % 5 == 0) {// 判断是不是5的倍数
		dsum = dsum - 6;// 从总数中扣去6元
	System.out.println("第" + day + "天花去6元，还剩" + dsum + "元！");
	}
	boolean flag = dsum >= sum;// 求dsum是否大于sum的boolean值
	if (flag) {	// 如果是true则输出最终的结果，并跳出循环
		System.out.println("要经过连续存储" + day + "天，才能存上100元！");
		break;
	} else {// 否则天数加1，也就是继续存钱
		day++;
	}
}*/

	}
}
