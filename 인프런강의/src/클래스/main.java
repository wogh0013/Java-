package Ŭ����;

public class main {
	public static void main(String[] args) {
		Student James = new Student(100, "James");
		Student Tomas = new Student(101, "Tomas");
		
		James.setKorea("����", 100);
		James.setMath("����", 95);
		
		Tomas.setKorea("����", 80);
		Tomas.setMath("����", 75);
		
		James.showStudentInfo();
		Tomas.showStudentInfo();
	}
}
