class Test2 {
	public static void main(String[] args) {
		int[][] arr = new int[6][6];
		for (int x=0;x<arr.length ; x++){
			for (int y=0;y<=x ;y++ ){         //先运行一次,输出一个一.此时x=1y.y也变为一,然后运行if
				if(y==0||y==x){
					arr[x][y]=1;
					System.out.print(arr[x][y]+" ");
					//continue ;
				}else {
					arr[x][y]=arr[x-1][y-1]+arr[x-1][y]	;
					System.out.print(arr[x][y]+" ");
				}
					
			}
			System.out.println();

		
		}
	}
}
