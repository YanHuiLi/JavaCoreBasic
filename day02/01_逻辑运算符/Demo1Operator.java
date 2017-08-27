class Demo1Operator {
	public static void main(String[] args) {
		//逻辑与
		int x = 10;
		//x == 5 & x == 15 
		//true & true = true
		//false & true = false
		//true & false = false
		//false & false = false
		//左右两边都为真的时候,结果才为真
		
		//逻辑或
		int y = 10;
		y > 10 | y == 10;
		//true | true = true
		//true | false = true
		//false | true = true
		//false | false = false
		//左右两边只要有一个为真,结果为真

		//逻辑异或
		//true ^ true = false
		//true ^ false = true
		//false ^ true = true
		//false ^ false = false
		//左右两边相同,结果为假,左右两边不同结果为真

		//逻辑非!
		!!true
		!!false
	}
}
