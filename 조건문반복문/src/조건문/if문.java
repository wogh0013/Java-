package ���ǹ�;

import java.util.Scanner;

public class if�� {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		
		System.out.print("������ �Է��ϼ���. ");
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
		
		System.out.printf("������ %c�Դϴ�.", grade);
	}
}
