class Test1Array {
	/*
	需求：公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99
	*/
	public static void main(String[] args) {
		int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		
		int sum = 0;									//声明一个变量,进行累加操作
		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y < arr[x].length ;y++ ) {
				sum = sum + arr[x][y];
			}
		}

		System.out.println(sum);
	}
}
