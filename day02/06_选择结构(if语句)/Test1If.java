import java.util.Scanner;
class Test1If {
	/*
		a:��ȡ���������нϴ��ֵ
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//��������
		System.out.println("�������һ������:");
		int x = sc.nextInt();						//������¼��������洢��x��
		System.out.println("������ڶ�������:");
		int y = sc.nextInt();						//������¼��������洢��y��

		int z;
		if(x > y) {
			//System.out.println(x);
			z = x;
		}else {
			//System.out.println(y);
			z = y;
		}

		int z = (x > y) ? x : y;
	}

	/*
	if else ����Ԫ������ŵ�����
	��������Ǹ�ֵ,����û����,��������Ԫ�����
	�����������������������ӵ����,ֻ����if else
	*/
}
