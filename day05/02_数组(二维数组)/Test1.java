/*
С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ���
�����Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��
*/
class Test1 {
	public static void main(String[] args) {
		/*int result = 100;
		double sum = 0;
		int day = 1;
		double dayMoney = 2.5;

		while (true) {
			sum = sum + dayMoney;
			if (day % 5 == 0) {
				sum = sum - 6;
			}

			if (sum >= result) {
				System.out.println("С������" + day + "�����100ԪǮ");
				break;
			}else {
				day++;
			}
		}*/

		int[][] arr = new int[6][6];
		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y < arr.length ;y++ ) {
				arr[x][0] = 1;
				arr[x][x] = 1;
			}
		}
		/*
		1 0 0 0
		1 1 0 0
		1 2 1 0
		1 3 3 1
		*/
		for (int x = 2;x < arr.length ;x++ ) {
			for (int y = 1;y <= x -1 ;y++ ) {
				arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
			}
		}

		for (int x = 0;x < arr.length ;x++ ) {
			for (int y = 0;y <=x ;y++ ) {
				System.out.print(arr[x][y] + "\t");
			}
			System.out.println();
		}

		/*
		2:���ݼ�������
		ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
		�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
		���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
		��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
		Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������
		*/

/*int sum = 100;// ���յ�Ŀ��
double db = 2.5;// ÿ�δ�ŵ�Ǯ��
int day = 1;// ����
double dsum = 0;// ÿ�δ�ŵ�����
while (true) {
	dsum = dsum + db;// ����ÿ�춼���Ǯ���ܺ�
	if (day % 5 == 0) {// �ж��ǲ���5�ı���
		dsum = dsum - 6;// �������п�ȥ6Ԫ
	System.out.println("��" + day + "�컨ȥ6Ԫ����ʣ" + dsum + "Ԫ��");
	}
	boolean flag = dsum >= sum;// ��dsum�Ƿ����sum��booleanֵ
	if (flag) {	// �����true��������յĽ����������ѭ��
		System.out.println("Ҫ���������洢" + day + "�죬���ܴ���100Ԫ��");
		break;
	} else {// ����������1��Ҳ���Ǽ�����Ǯ
		day++;
	}
}*/

	}
}
