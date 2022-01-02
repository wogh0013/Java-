package 변수와메서드;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static  메서드는 객체 생성 없이 바로 호출 가능.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() 호출");
	}
}

// 객체 생성 없이 메서드를 호출하려면, 호출하려는 메서드 앞에 static 키워드를 붙여야 한다.

// 호출스택 순서
// 빈 공간 -> main 메서드 수행 -> firstMethod() 호출 -> secondMethod() 호출 -> println() 호출 -> 화면 출력
// -> secondMethod() 종료 -> firstMethod() 종료 -> main 메서드 종료 -> 빈 공간