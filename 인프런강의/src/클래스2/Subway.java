package 클래스2;

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
		System.out.println(lineNumber + "호선 지하철의 승객은 "
				+ passangerCount + "명이고, 수입은 " + money + "원입니다.");
	}
}
