package 배열;

public class 이차원배열 {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {4,5,6}}; //2x3
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
