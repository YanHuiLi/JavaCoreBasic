class Demo4Array {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};		//二维数组的第三种格式

		//System.out.println(arr.length);				//代表一维数组的个数
		//二维数组的遍历
		for (int x = 0;x < arr.length ;x++ ) {			//外层循环获取到每一个一维数组
			//arr[x]  arr[0] arr[1] arr[2]
			for (int y = 0;y < arr[x].length ;y++ ) {
				System.out.print(arr[x][y] + " ");
			}

			System.out.println();
		}
	}
}
