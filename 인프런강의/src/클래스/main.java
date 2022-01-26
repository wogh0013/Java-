package 클래스;

public class main {
	public static void main(String[] args) {
		Student James = new Student(100, "James");
		Student Tomas = new Student(101, "Tomas");
		
		James.setKorea("국어", 100);
		James.setMath("수학", 95);
		
		Tomas.setKorea("국어", 80);
		Tomas.setMath("수학", 75);
		
		James.showStudentInfo();
		Tomas.showStudentInfo();
	}
}
