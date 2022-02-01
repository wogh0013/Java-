package 추상클래스2;

public abstract class Car {
	
	//추상 메서드 -> 자식클래스에서 구현할 의무가 있다.
	//자식클래스에서 구현하지 않으면 오류가 난다.
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//final이 붙은 메서드는 재정의할 수 없다.
	//run() 메서드의 일련과정은 고정된 과정이므로 변경X
	// -> template 메서드
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
