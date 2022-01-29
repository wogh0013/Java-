package 추상클래스;

//추상클래스는 상속을 위해 만들어진 클래스이다.
//추상클래스는 인스턴스화될 수 없다.
//하위클래스가 추상클래스를 기반으로 클래스를 만든다. 
//추상메서드는 하위클래스에서 구현이 돼야 한다.
//기본메서드는 공용으로 쓰는 메서드이다. -> 오버라이딩 가능
//상속용으로만 사용하는 경우 추상클래스로 만든다.
public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
