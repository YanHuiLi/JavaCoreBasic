import java.util.Scanner;							//�����
class Test1Scanner {
	public static void main(String[] args) {
		/*
		* A:������ʾ
		* ����¼����ϰ������¼���������ݣ�����������������ͣ��������
		* B:������ʾ
		* ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
		*/
		Scanner sc = new Scanner(System.in);		//��������

		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();

		/*System.out.println("���������ĺ���:");
		int temp = x + y;
		System.out.println(temp);*/

		int result = (x > y) ? x : y;
		System.out.println("�������������ֵ��:");
		System.out.println(result);
	}
}
