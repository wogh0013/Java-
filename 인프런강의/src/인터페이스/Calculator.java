package 인터페이스;

//Calc의 모든 추상 메서드를 구현하지 않으면 추상 클래스가 됨
public abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	
}
