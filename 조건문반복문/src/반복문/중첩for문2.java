package �ݺ���;

public class ��øfor��2 {
	public static void main(String[] args) {
		int i, j;
		
		for(i=1; i<10; i++) {
			System.out.println(2 + " * " + i + " = " + 2*i);
		}
	
		System.out.println();
		
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++)
				System.out.println(i+" * "+j+" = "+i*j);
			System.out.println();
		}
	}
}
