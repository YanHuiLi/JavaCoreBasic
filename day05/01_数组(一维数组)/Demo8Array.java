import java.util.Scanner;
class Demo8Array {
	/*
	������(���ݼ���¼������,���Ҷ�Ӧ����)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		System.out.println("�������Ӧ������,�������ֵ��1-7֮��:");
		int week = sc.nextInt();
		char c = getWeek(week);
		System.out.println("����������" + c);
	}

	/*
	��ȡ���ڶ�Ӧ��ֵ
	1,��ȷ����ֵ����char
	2,��ȷ�����б�int week
	*/

	public static char getWeek(int week) {					//������Ҫ��ȡ������
		char[] arr = {' ','һ','��','��','��','��','��','��'};//�����
		return arr[week];									//���ض�Ӧ������
	}
}
