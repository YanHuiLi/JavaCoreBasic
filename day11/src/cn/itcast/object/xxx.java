package cn.itcast.object;

public class xxx {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {2, 3, 4};
		int[] c = new int[0];
		int[][] ab = {{1,2,3,4}, {2,3,4}, {}};
		ab[1][2] = 100;
		System.out.println(b[2]);

	}
}
