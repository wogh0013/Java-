package ���ǹ�;

import java.util.Random;
import java.util.Scanner;

public class switch��2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���. ");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3) + 1;
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("��ǻ�ʹ� " + com + "�Դϴ�.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
			break;
		}
	}
}
