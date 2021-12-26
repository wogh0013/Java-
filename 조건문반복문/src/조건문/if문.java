package 조건문;

import java.util.Scanner;

public class if문 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if(score>=90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}
		else if(score>=70) {
			grade = 'C';
		}
		else if(score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.printf("성적은 %c입니다.", grade);
	}
}
