package �������迭;

import java.util.Scanner;

public class MultiArrEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] words = {
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"integer", "����"}
		};
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1]))
				System.out.println("�����Դϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�. ������ "+ words[i][1] + "�Դϴ�.");
			System.out.println();
		}
	}
}
