package 배열;

public class 섞기 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // 0~9 중 임의의 숫자를 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;		// numArr[0]과 numArr[n]의 값을 서로 바꾼다.
		}
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i]);
	}
}
