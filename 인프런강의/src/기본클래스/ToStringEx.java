package �⺻Ŭ����;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//Book Ŭ������ ����ϸ� �ּڰ��� ��µȴ�.
	//Book Ŭ������ toString() �Լ��� �������ؼ� ���ڿ��� ����ϰ� �����.
	public String toString() {
		return title + ", " + author;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		
		Book book = new Book("�����ڹ�", "������");
		System.out.println(book);
		
		//String Ŭ�������� toString()�� �����ǵ��־ ���� �� �ʿ�X
		String str = new String("test");
		System.out.println(str);
	}
}
