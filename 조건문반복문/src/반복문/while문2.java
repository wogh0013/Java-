package 반복문;

import java.util.Scanner;

public class while문2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		int num=1;
		int sum=0;
		
		while(num!=0) {
			System.out.print(">>");
			num = sc.nextInt();
			sum+=num;
		}
		
		System.out.println("합계 : " + sum);
		
	}
}
