class Demo2Break {
	public static void main(String[] args) {
		//���,��ʵҲ�ǺϷ��ı�ʶ��
		a :for (int x = 1;x <= 5 ;x++ ) {
			System.out.println("x = " + x);

			b :for (int y = 1;y <= 5 ;y++ ) {
				if (y == 3) {
					break a;						//��ſ�������ָ����ѭ��
				}
				System.out.println("y = " + y);
			}
		}

		System.out.println("��Һ�");
		http://Yanhuili.github.io;						//��ַ��ʵ�ǵ���ע��,http��ʵ�Ǳ��
		System.out.println("������ĺ�");
	}
}
