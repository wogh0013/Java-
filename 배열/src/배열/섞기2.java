package 배열;

public class 섞기2 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp=0; // 값을 바꾸기 위한 임시변수
		int j=0; 	// 임의의 값을 얻어서 저장할 변수
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45); //0~44 랜덤숫자
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;     // ball[i]와 ball[j]의 값 변경
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
	}
}
