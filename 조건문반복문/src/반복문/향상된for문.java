package �ݺ���;

//for(Ÿ�� ������ : �迭 �Ǵ� �÷���){
//�ݺ��� ����
//}

public class ����for�� {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int tmp : arr)
			System.out.print(tmp + " ");
	}	
}
