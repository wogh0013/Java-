package �ݺ���;

import java.util.Scanner;

public class continue��2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0, num=0;
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���. (����: 0) >> ");
			String tmp = sc.nextLine();
			menu = (int)(Integer.parseInt(tmp));
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				break;
			}	
			
			else if(!(1<=menu && menu<=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				System.out.println();
				continue;
			}
			
			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
			System.out.println();
		}
	}
}
