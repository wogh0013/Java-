package 반복문;

import java.util.Scanner;

public class dowhile문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0, answer=0;
		answer = (int)(Math.random()*100)+1; //1~100사이 임의의 수 저장
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요. ");
			input = sc.nextInt();
			
			if(input > answer)
				System.out.println("더 작은 수를 입력하세요.");
			else if(input < answer)
				System.out.println("더 큰 수를 입력하세요.");
		} while(input!=answer);
		
		System.out.println("정답입니다.");
	}
}
