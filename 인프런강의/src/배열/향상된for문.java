package 배열;

public class 향상된for문 {
	public static void main(String[] args) {
		String[] strArr = {"Java", "Android", "C++"};
		
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		
		for(String s : strArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		int[] intArr = {1,2,3,4,5};
		
		for(int num : intArr)
			System.out.print(num + " ");
	}
}
