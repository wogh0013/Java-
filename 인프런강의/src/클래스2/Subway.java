package Ŭ����2;

public class Subway {
	int lineNumber;
	int passangerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		passangerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "ȣ�� ����ö�� �°��� "
				+ passangerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}
}
