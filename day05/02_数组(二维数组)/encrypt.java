import java.util.Scanner;
class encrypt
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("请输入您要传输的数据");
		int data=sc.nextInt();
		/*int a=data%10;//1
		int b=data/10%10;//2
		int c=data/10/10%10;//3
		int d=data/10/10/10%10;//4
		int e=data/10/10/10/10%10;//5
		int f=data/10/10/10/10/10%10;//6
		int g=data/10/10/10/10/10/10/10;//7*/
		
		int[] arr={1,2,3,4,5,6,7};//定义一个数组
		getdata1(arr);//引用函数
		print(arr);

	}
	public static void getdata1(int[] arr){
		for (int x=0;x<=arr.length/2 ; x++){
			int temp=arr[x];
				arr[x]=arr[arr.length-1-x];
				arr[arr.length-1-x]=temp;
				
				}
			
		}
		public static void print(int [] arr){
			for (int y=0;y<arr.length ;y++ ){
					//arr[y]=(arr[y]+5)%10;
				
					System.out.println(arr[y]);
				}
		}
		
}
