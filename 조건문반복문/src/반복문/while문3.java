package �ݺ���;

import java.util.Scanner;

public class while��3 {
	public static void main(String[] args) {
		int num;
		int sum=0;
		boolean flag=true; //while���� ���ǽ����� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�հ踦 ���� ���ڸ� �Է��ϼ���.(�������� 0�� �Է�)");
		
		while(flag) { //flag�� ���� true�̹Ƿ� ���ǽ��� ���� �ȴ�. ���ѷ���
			System.out.print(">>");
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0)
				sum += num; //num�� 0�� �ƴϸ� sum�� ���Ѵ�.
			else
				flag=false; //num�� 0�̸� while�� ����	
		}
		
		System.out.println("�հ� : " + sum);
	}
}
