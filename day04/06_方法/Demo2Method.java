class Demo2Method {
	public static void main(String[] args) {
		//int sum = getSum(4,5);			//赋值调用
		//System.out.println(sum);
		//炒菜(瘦肉精猪肉,烂白菜,铬大米,地沟油);
		//有具体返回值
		//getSum(4,5);						//单独调用不推荐
		System.out.println(getSum(4,5));	//输出调用,暂时不推荐,怕你看不懂

		//return;							//如果方法的返回值类型是void,有return语句是这样写的return;
											//这个return可以省略,省略之后jvm会帮我加上
	}

	/*
	求两个整数的和
	1,明确返回值类型
	2,明确参数列表
	*/

	public static int getSum(int x,int y) {//int x = 4,int y = 5
		int sum = x + y;					// sum = 9

		return sum;
	}

	/*
	盘子 炒菜(肉,菜,米,油) {
		炒菜的动作;
		return 一盘菜;
	}
	*/
}
