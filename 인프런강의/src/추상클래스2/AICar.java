package 추상클래스2;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행합니다.");
		System.out.println("자동차가 스스로 방향을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 정지합니다.");
	}
	
}
