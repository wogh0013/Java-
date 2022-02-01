package 인터페이스;

//Calculator를 상속받은 후 모든 메서드를 구현 -> CompleteCalc는 생성가능한 클래스가 됨
public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2!=0) {
			return num1 / num2;
		}
		return ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
