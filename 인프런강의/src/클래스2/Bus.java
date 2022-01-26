package 클래스2;

public class Bus {
	int busNumber;
	int passangerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		passangerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객수는 " 
				+ passangerCount + "명이고, 수입은 " + money + "원입니다.");
	}
}
