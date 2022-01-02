package �������迭;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = 5;
		int x=0, y=0, num=0;
		
		int[][] bingo = new int[SIZE][SIZE];
		
		//�迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
		for(int i=0; i<SIZE; i++) 
			for(int j=0; j<SIZE; j++)
				bingo[i][j] = i*SIZE + j + 1;
			
		//�迭�� ����� ���� �ڼ��´�. (shuffle)
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		do {
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���.(����:0) ", SIZE*SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			//�Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
			outer:
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE; j++) {
						if(bingo[i][j]==num) {
							bingo[i][j] = 0;
							break outer; //2�� �ݺ����� �����.
						}
					}
				}
		} while(num!=0);
	}
}
