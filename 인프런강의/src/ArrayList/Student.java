package ArrayList;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total=0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println("�л� " + studentName + "���� "
					+ subject.getName() + " ������ ������ "
					+ subject.getScore() + "���Դϴ�.");	
		}
		System.out.println("������ " + total + "���Դϴ�.");
	}
	
}
