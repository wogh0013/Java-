package �ݺ���;

import java.util.Scanner;

public class dowhile�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input=0, answer=0;
		answer = (int)(Math.random()*100)+1; //1~100���� ������ �� ����
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���. ");
			input = sc.nextInt();
			
			if(input > answer)
				System.out.println("�� ���� ���� �Է��ϼ���.");
			else if(input < answer)
				System.out.println("�� ū ���� �Է��ϼ���.");
		} while(input!=answer);
		
		System.out.println("�����Դϴ�.");
	}
}
