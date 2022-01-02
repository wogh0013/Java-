package 다차원배열;

public class Ex {
	public static void main(String[] args) {
		System.out.println("국어\t영어\t수학\t");
		int k=10;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++)
				System.out.print(k + "\t");
			k+=10;
			System.out.println();
		}	
	}
}
