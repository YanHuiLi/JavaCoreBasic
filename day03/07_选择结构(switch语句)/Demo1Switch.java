
class Demo1Switch {
	/*
	switch(���ʽ) {		���ʽ������byte,short,char,int,ֻҪ���Զ���������Ϊint���͵Ķ�����
	      case ֵ1��		//jdk1.5�汾���Խ���ö��
			�����1;		//jdk1.7�汾���Խ����ַ���String
			break;
		    case ֵ2��
			�����2;
			break;
		    ��
		    default��	
			�����n+1;
			break;
    }
		switch������������
		1,����break
		2,����ִ�е�switch��ĩβ
	*/
	public static void main(String[] args) {
		String name = "����";
		String gender = "��";

		switch(gender) {
			case "��":
				System.out.println(name + "��һλ" + gender + "ʿ,ϲ���Է�˯����lol");
			break;										//����switch���
			case "Ů":
				System.out.println(name + "��һλ" + gender + "ʿ,ϲ����ֹ�������");
			break;
			default: 
				System.out.println(name + "��һλ" + gender + ",ϲ������Լ���,ά����ò����");
			break;
		}
	}
}
