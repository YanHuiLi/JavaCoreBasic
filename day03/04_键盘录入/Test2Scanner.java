import java.util.Scanner;							//�����
class Test2Scanner {
	public static void main(String[] args) {
		/*
		* A:������ʾ
		* ����¼����ϰ������¼���������ݣ��Ƚ������������Ƿ����
		* B:������ʾ
		* ����¼����ϰ������¼���������ݣ���ȡ�����������е����ֵ
		*/

		Scanner sc = new Scanner(System.in);		//��������

		System.out.println("�������һ������:");
		int x = sc.nextInt();
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();

		/*boolean b = (x == y);
		System.out.println(b);*/
		System.out.println("���������������:");
		int z = sc.nextInt();

		int temp = (x > y) ? x : y;
		int temp2 = (temp > z) ? temp : z;
		System.out.println("�������������ֵ��:" + temp2);
	}
}
