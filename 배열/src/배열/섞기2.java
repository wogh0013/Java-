package �迭;

public class ����2 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp=0; // ���� �ٲٱ� ���� �ӽú���
		int j=0; 	// ������ ���� �� ������ ����
		
		for(int i=0; i<6; i++) {
			j = (int)(Math.random()*45); //0~44 ��������
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;     // ball[i]�� ball[j]�� �� ����
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d\n", i, ball[i]);
	}
}
