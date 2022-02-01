package 기본클래스;

class Student{
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			
			if(studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	
}

public class EqualsEx {
	public static void main(String[] args) {
		Student std1 = new Student(100, "Tomas");
		Student std2 = new Student(100, "Tomas");
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
	}
}
