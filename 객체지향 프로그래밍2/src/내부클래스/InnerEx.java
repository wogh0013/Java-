package ����Ŭ����;

public class InnerEx {
	class InstanceInner{
		int iv=100;
//		static int cv=100; //����, static ������ ���� X
		final static int CONST=100; //final static�� ����� ���
	}
	
	static class StaticInner{
		int iv=200;
		static int cv=200;	//staticŬ�������� static����� ������ �� �ִ�.
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
//			static int cv=300; // ���� static���� �Ұ�
			final static int CONST=300; //��� ���
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
}
