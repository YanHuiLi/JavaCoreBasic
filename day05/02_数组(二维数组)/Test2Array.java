class Test2Array {
/*
Java�е����Ǵ�ֵ���Ǵ�ַ?

1,Java�м���ֵҲ��ַ,�����������ʹ�����ֵ,�����������ʹ�����ַ(��ַ)
2,Java���Ǵ�ֵ,�Ǵ�ַ,��Ϊ��ֵַҲ��ֵ(��˾��֧��)
*/
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a:"+a+",b:"+b);
		change(a,b);
		System.out.println("a:"+a+",b:"+b);		//10,20?

		int[] arr = {1,2,3,4,5};
		change(arr);
		System.out.println(arr[1]);				//4
	}

	public static void change(int a,int b) {	//a = 10 b = 20
		System.out.println("a:"+a+",b:"+b);		//a = 10 b = 20
		a = b;									//a = 20
		b = a + b;								//b = 40
		System.out.println("a:"+a+",b:"+b);		//a = 20 b = 40
	}

	public static void change(int[] arr) {		//1,2,3,4,5
		for(int x=0; x<arr.length; x++) {		//1,4,3,8,5
			if(arr[x]%2==0) {
				arr[x]*=2;
			}
		}
	}
}
