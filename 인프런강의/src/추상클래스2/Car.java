package �߻�Ŭ����2;

public abstract class Car {
	
	//�߻� �޼��� -> �ڽ�Ŭ�������� ������ �ǹ��� �ִ�.
	//�ڽ�Ŭ�������� �������� ������ ������ ����.
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//final�� ���� �޼���� �������� �� ����.
	//run() �޼����� �Ϸð����� ������ �����̹Ƿ� ����X
	// -> template �޼���
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
