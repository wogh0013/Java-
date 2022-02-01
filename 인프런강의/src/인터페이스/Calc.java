package 인터페이스;

//인터페이스 : 모든 메서드가 추상 메서드로 이루어진 클래스
//			형식적인 선언O, 구현X
//			여러 개 상속받을 수 있음
//인터페이스에 구현된 모든 메서드 : public abstract로 추상 메서드
//인터페이스에 구현된 모든 변수   : public static final로 상수
public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
