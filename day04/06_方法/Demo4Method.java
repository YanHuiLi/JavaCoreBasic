import java.util.Scanner;
class Demo4Method {
	/*
	* A:������ʾ
	* ���󣺸��ݼ���¼����������������ڿ���̨�������
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("������ڶ�������");
		int y = sc.nextInt();

		//print(x,y);									//�������ֵ��void,����ֱ�ӵ���
		//System.out.println(print(x,y));				//����ֵ��void�ķ����ǲ��ܴ�ӡ���
	}

	/*
	���巽����ӡ����
	1,��ȷ����ֵ����,void,�޷���ȷ���巵��ֵ����
	2,��ȷ�����б�,int a,int b
	*/

	public static void print(int a,int b) {
		for (int x = 1;x <= a ;x++ ) {
			for (int y = 1;y <= b ;y++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
