package 반복문;

//for(타입 변수명 : 배열 또는 컬렉션){
//반복할 문장
//}

public class 향상된for문 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int tmp : arr)
			System.out.print(tmp + " ");
	}	
}
