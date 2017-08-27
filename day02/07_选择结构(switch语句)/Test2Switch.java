class Test2Switch {
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		switch(x){
			default:
				y++;
				//break;
			case 3:
				y++;
			case 4:
				y++;
		}
		System.out.println("y="+y);
	
	}
}
