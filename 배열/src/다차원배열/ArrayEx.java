package �������迭;

public class ArrayEx {
	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
		};
	
		int sum=0;
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++)
				System.out.println("score["+i+"].["+j+"]="+ score[i][j]);
		}
		
		for(int[] tmp : score) { //score�� �� ��Ҹ� tmp�� ����
			for(int i : tmp) 	 //tmp�� 1���� �迭�� ����Ű�� ��������
				sum+=i; //sum = sum + i;
		}
	}
}
