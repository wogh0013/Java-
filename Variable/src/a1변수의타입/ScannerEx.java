package a1������Ÿ��;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �ڸ� ������ �ϳ��� �Է����ּ���. >");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		
		System.out.println("�Է³��� : " + input);
		System.out.printf("num = %d\n", num);
	}
}
