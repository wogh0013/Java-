package 다차원배열;

import java.util.Scanner;

public class MultiArrEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1]))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다. 정답은 "+ words[i][1] + "입니다.");
			System.out.println();
		}
	}
}
