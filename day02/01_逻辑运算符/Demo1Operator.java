class Demo1Operator {
	public static void main(String[] args) {
		//�߼���
		int x = 10;
		//x == 5 & x == 15 
		//true & true = true
		//false & true = false
		//true & false = false
		//false & false = false
		//�������߶�Ϊ���ʱ��,�����Ϊ��
		
		//�߼���
		int y = 10;
		y > 10 | y == 10;
		//true | true = true
		//true | false = true
		//false | true = true
		//false | false = false
		//��������ֻҪ��һ��Ϊ��,���Ϊ��

		//�߼����
		//true ^ true = false
		//true ^ false = true
		//false ^ true = true
		//false ^ false = false
		//����������ͬ,���Ϊ��,�������߲�ͬ���Ϊ��

		//�߼���!
		!!true
		!!false
	}
}
