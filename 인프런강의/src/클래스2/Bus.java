package Ŭ����2;

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
		System.out.println(busNumber + "�� ������ �°����� " 
				+ passangerCount + "���̰�, ������ " + money + "���Դϴ�.");
	}
}
