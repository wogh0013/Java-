package ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentKim = new Student(1, "Kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 90);
		studentKim.addSubject("����", 80);
		
		studentKim.showStudentInfo();
		
		System.out.println();
		
		Student studentLee = new Student(2, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		studentLee.showStudentInfo();
	}
}
