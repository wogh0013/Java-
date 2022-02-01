package 인터페이스;

public class CalculatorTest {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(3, 4));
		System.out.println(calc.substract(5, 4));
		System.out.println(calc.times(3, 4));
		System.out.println(calc.divide(4, 2));
		
	}
}
