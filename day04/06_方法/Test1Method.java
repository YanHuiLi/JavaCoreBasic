class Test1Method {

	/*
	* A:������ʾ
	* ���󣺱Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ����byte���ͣ�
	* ����short���ͣ�����int���ͣ�����long���ͣ�����main�����н��в���
	*/
	public static void main(String[] args) {
		/*byte b1 = 3;
		byte b2 = 4;
		boolean b3 = isEquals(b1,b2);
		System.out.println(b3);*/

		int x = 1;
		while (x <= 10000);						//��˿��Ů��ܾ�
		
		{
			System.out.println("I Love You!!!!");
			x++;
		}
	}

	//�Ƚ�����byte����
	public static boolean isEquals(byte a,byte b) {
		System.out.println("byte");
		return a == b;
	}

	//�Ƚ�����short����
	public static boolean isEquals(short a,short b) {
		System.out.println("short");
		return a == b;
	}

	//�Ƚ�����int����
	public static boolean isEquals(int a,int b) {
		System.out.println("int");
		return a == b;
	}

	//�Ƚ�����long����
	public static boolean isEquals(long a,long b) {
		System.out.println("long");
		return a == b;
	}
}
