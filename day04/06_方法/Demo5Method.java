import java.util.Scanner;
class Demo5Method {
	//���󣺸��ݼ���¼������������Ӧ�ĳ˷���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������
		System.out.println("������һ������");
		int x = sc.nextInt();

		print99(x);
	}

	/*
	��ӡ99�˷���
	1,��ȷ����ֵ����void
	2,��ȷ�����б�int a
	*/

	public static void print99(int a) {
		for (int x = 1;x <= a ;x++ ) {
			for (int y = 1;y <= x ;y++ ) {
				System.out.print(y +"*" + x + "=" + (y * x) + "\t");
			}

			System.out.println();
		}
	}
}
