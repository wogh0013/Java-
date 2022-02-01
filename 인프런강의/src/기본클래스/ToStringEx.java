package 기본클래스;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	//Book 클래스를 출력하면 주솟값이 출력된다.
	//Book 클래스에 toString() 함수를 재정의해서 문자열로 출력하게 만든다.
	public String toString() {
		return title + ", " + author;
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		
		Book book = new Book("두잇자바", "박은종");
		System.out.println(book);
		
		//String 클래스에는 toString()이 재정의돼있어서 따로 할 필요X
		String str = new String("test");
		System.out.println(str);
	}
}
