package 반복문;

public class 중첩for문 {
	public static void main(String[] args) {
		int i,j;
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=10; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(i=1; i<=5; i++) {
			for(j=5; j>=i; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
