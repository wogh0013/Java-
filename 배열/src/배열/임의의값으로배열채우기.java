package �迭;

import java.util.Arrays;

public class �����ǰ����ι迭ä��� {
	public static void main(String[] args) {
		int[] code = {-4,-3,-1,-6,11,5,6}; //�ҿ������� ������ �迭
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random() * code.length);
			arr[i] = code[tmp]; //code�迭 �ȿ� �ִ� ������ ���ڸ� arr�迭�� �����Ѵ�
		}
		
		System.out.println(Arrays.toString(arr)); // arr �迭�� ���ڿ��� ��ȯ�� ����?
		
	}
}
