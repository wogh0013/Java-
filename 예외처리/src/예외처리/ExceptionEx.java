package 예외처리;

public class ExceptionEx {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리됐습니다.");
		}
	}
	
	static void method1() throws Exception{
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 처리됐습니다.");
			throw e;	//다시 예외를 발생시킨다.
		}
	}
}

