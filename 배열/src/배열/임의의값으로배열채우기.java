package 배열;

import java.util.Arrays;

public class 임의의값으로배열채우기 {
	public static void main(String[] args) {
		int[] code = {-4,-3,-1,-6,11,5,6}; //불연속적인 값들의 배열
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp]; //code배열 안에 있는 랜덤의 숫자를 arr배열에 대입한다
		}
		
		System.out.println(Arrays.toString(arr)); // arr 배열을 문자열로 변환해 나열?
		
	}
}
