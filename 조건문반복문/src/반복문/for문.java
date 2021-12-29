package 반복문;

public class for문 {
	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10; i++)
		{
			sum += i; // sum = sum + i;
			System.out.printf("1부터 %2d까지의 합은 : %2d입니다.\n", i, sum);
		}
	}
}
