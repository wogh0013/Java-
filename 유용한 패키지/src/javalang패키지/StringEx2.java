package javalang��Ű��;

public class StringEx2 {
	public static void main(String[] args) {
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');
		System.out.println(".�� ��ġ�� " + index);
		
		//fullName�� 'ù ��° ����' ~ '.' ������ ���ڿ� ����
		String fileName = fullName.substring(0, index);
		
		//�� ���� ������ ���ڿ� ����
		//String ext = fullName.substring(index+1, fullName.length());
		String ext = fullName.substring(index);
		
		System.out.println("���ϸ��� " + fileName);
		System.out.println("Ȯ���ڴ� " + ext);
	}
}
