
class Demo1Switch {
	/*
	switch(表达式) {		表达式可以是byte,short,char,int,只要能自动类型提升为int类型的都可以
	      case 值1：		//jdk1.5版本可以接收枚举
			语句体1;		//jdk1.7版本可以接收字符串String
			break;
		    case 值2：
			语句体2;
			break;
		    …
		    default：	
			语句体n+1;
			break;
    }
		switch语句结束有两种
		1,遇到break
		2,程序执行到switch的末尾
	*/
	public static void main(String[] args) {
		String name = "张三";
		String gender = "妖";

		switch(gender) {
			case "男":
				System.out.println(name + "是一位" + gender + "士,喜欢吃饭睡觉打lol");
			break;										//跳出switch语句
			case "女":
				System.out.println(name + "是一位" + gender + "士,喜欢逛街购物美容");
			break;
			default: 
				System.out.println(name + "是一位" + gender + ",喜欢打雌性激素,维持美貌容颜");
			break;
		}
	}
}
