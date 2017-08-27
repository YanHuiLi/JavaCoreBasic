class Test1ForFor {
	/*
	 A:案例演示
* 
		需求：请输出下列的形状
		*
		**
		***
		****
		*****

		*****
		****
		***
		**
		*
	分析:
	1,这个图形有行有列,想到for的嵌套循环,外层循环决定行数,内存循环决定列数
	2,外层循环是五次不变,内层循环从1变化到5
	*/
	public static void main(String[] args) {
		/*for (int x = 1;x <= 5 ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {			//x 从1变化到5
				System.out.print("*");
			}
			System.out.println();
		}*/

		for (int x = 1;x <= 5 ;x++ ) {
			for (int y = x;y <= 5 ;y++ ) {			//x 从1变化到5
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*
	*****
	****
	***
	**
	*
	*/
}
