package Ŭ����2;

public class Student {
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(2000);
		money -= 2000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(3000);
		money -= 3000;
	}
	
	public void showInfo() {
		System.out.println(grade + "�г�" + studentName + " �л��� �ܾ���" + money + "���Դϴ�.");
	}
}
