package �ݺ���;

import java.util.Scanner;

public class while��2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���. (�������� 0�� �Է�)");
		int num=1;
		int sum=0;
		
		while(num!=0) {
			System.out.print(">>");
			num = sc.nextInt();
			sum+=num;
		}
		
		System.out.println("�հ� : " + sum);
		
	}
}
