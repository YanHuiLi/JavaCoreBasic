import java.util.Scanner;
class Demo3Method {
	/*
	* A:������ʾ
	* ���󣺼���¼���������ݣ������������еĽϴ�ֵ	
	* B:������ʾ
	* ���󣺼���¼���������ݣ��Ƚ��������Ƿ����
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������
		System.out.println("�������һ������");
		int x = sc.nextInt();
		System.out.println("������ڶ�������");
		int y = sc.nextInt();

		//int max = getMax(x,y);
		//System.out.println("���������е����ֵ�� :" + max);

		boolean b = isEquals(x,y);
		System.out.println(b);
	}

	/*
	��ȡ�������������ֵ
	1,��ȷ����ֵ����,int
	2,��ȷ�����б�,int a,int b
	*/

	public static int getMax(int a,int b) {
		return a > b ? a : b;
	}

	/*
	�ж����������Ƿ����
	1,��ȷ����ֵ����,boolean
	2,��ȷ�����б�,int a,int b
	*/

	public static boolean isEquals(int a,int b) {
		return a == b;
	}
}
