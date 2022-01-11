package 내부클래스;

public class InnerEx {
	class InstanceInner{
		int iv=100;
//		static int cv=100; //에러, static 변수는 선언 X
		final static int CONST=100; //final static은 상수라서 허용
	}
	
	static class StaticInner{
		int iv=200;
		static int cv=200;	//static클래스에만 static멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
//			static int cv=300; // 역시 static변수 불가
			final static int CONST=300; //상수 허용
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
