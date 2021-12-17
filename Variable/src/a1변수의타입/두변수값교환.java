package a1변수의타입;

public class 두변수값교환 {
	public static void main(String[] args) {
		
		// 두 변수의 값 교환하기
		int x=10;
		int y=20;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x + " " + y + " "+ temp);
		
		
		
	}
}
