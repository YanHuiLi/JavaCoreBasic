class Demo2Break {
	public static void main(String[] args) {
		//标号,其实也是合法的标识符
		a :for (int x = 1;x <= 5 ;x++ ) {
			System.out.println("x = " + x);

			b :for (int y = 1;y <= 5 ;y++ ) {
				if (y == 3) {
					break a;						//标号可以跳出指定的循环
				}
				System.out.println("y = " + y);
			}
		}

		System.out.println("大家好");
		http://Yanhuili.github.io;						//网址其实是单行注释,http其实是标号
		System.out.println("才是真的好");
	}
}
