package �����͸޼���;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static  �޼���� ��ü ���� ���� �ٷ� ȣ�� ����.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() ȣ��");
	}
}

// ��ü ���� ���� �޼��带 ȣ���Ϸ���, ȣ���Ϸ��� �޼��� �տ� static Ű���带 �ٿ��� �Ѵ�.

// ȣ�⽺�� ����
// �� ���� -> main �޼��� ���� -> firstMethod() ȣ�� -> secondMethod() ȣ�� -> println() ȣ�� -> ȭ�� ���
// -> secondMethod() ���� -> firstMethod() ���� -> main �޼��� ���� -> �� ����