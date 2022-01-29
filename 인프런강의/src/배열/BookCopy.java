package 배열;

//깊은 복사 : 복사 대상의 인스턴스를 따로 생성해주고 직접 값 대입, 
//			주솟값이 복사되는 것이 아니라 인스턴스값을 복사해주는 것이다.
//			복사 대상을 따로 관리할 수 있음 !
public class BookCopy {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//직접 복사
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("===========");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}
}
