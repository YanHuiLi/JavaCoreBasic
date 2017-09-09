package cn.itcast.eclipse;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//求和
		int sum = 0;						//断点一般放在方法的第一句的有效位置
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
