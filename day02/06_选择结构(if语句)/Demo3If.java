class Demo3If {
	/*
	if(比较表达式1) {
			语句体1;
	}else if(比较表达式2) {
		语句体2;
	}else if(比较表达式3) {
		语句体3;
	}
	...
	else {
		语句体n+1;
	}
	*/
	public static void main(String[] args) {
		int x = 3;
		if(x == 1) {
			System.out.println("进男厕所");
		}else if(x == 0) {
			System.out.println("进女厕所");
		}else {
			System.out.println("无法识别您的性别");
		}
	}

}
