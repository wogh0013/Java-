package ���ǹ�;

import java.util.Scanner;

public class ��øif�� {
	public static void main(String[] args) {
		int score=0;
		char grade=' ', opt='0';
		
		System.out.print("������ �Է����ּ���. ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("����� ������ %d���Դϴ�.\n", score);
		
		if(score>=90) {
			grade='A';
			if(score>=98) {
				opt='+';
			}
			else if(score<=94) {
				opt='-';
			}
		}
		
		else if(score>=80) {
			grade='B';
			if(score>=88) {
				opt='+';
			}
			else if(score<=84) {
				opt='-';
			}
		}
		
		else {
			grade='C';
			opt=' ';
		}
		
		System.out.printf("����� ������ %c%c�Դϴ�.", grade, opt);
	}
}
