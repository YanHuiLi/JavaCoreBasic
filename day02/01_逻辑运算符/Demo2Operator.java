class Demo2Operator {
	public static void main(String[] args) {
		//逻辑与和短路与
		//true & true = true
		//false & true = false
		//true & false = false
		//false & false = false
		//左右两边都为真的时候,结果才为真

		//true && true = true
		//false && true = false
		//true && false = false
		//false && false = false

		/*
		&和&&的区别(面试题)
		&无论左边是true还是false,右边都参与运算
		&&左边如果为false,右边不参与运算,左边如果为true,右边参与运算
		*/

		//逻辑或和短路或
		//true | true = true
		//true | false = true
		//false | true = true
		//false | false = false
		//左右两边只要有一个为真,结果为真

		//true || true = true
		//true || false = true
		//false || true = true
		//false || false = false
		/*
		|和||的区别
		|无论左边是true还是false,右边都参与运算
		||左边如果为true,右边不参与运算,左边如果为false,右边参与运算
		*/
		
	}
}
