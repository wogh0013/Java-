package 추상클래스;

public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); // 에러 -> 추상클래스는 인스턴스화될 수 없다.
		Computer c2 = new Desktop();
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		NoteBook c5 = new MyNoteBook(); //Computer > NoteBook > MyNoteBook
		
//		c5.add();
		
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
		c5.display();
		c5.typing();
	}
}
