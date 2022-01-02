package 클래스와객체;

public class 계산기실행 {
	public static void main(String[] args) {
		계산기 cal = new 계산기();
		
		int a = cal.add(3, 4);
		int b = cal.sub(5, 2);
		int c = cal.mul(3, 5);
		int d = cal.div(15, 5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
}
