package ����Ŭ����;

public class anonymousEx {
	Object iv = new Object() {void method(){}};			//�͸� Ŭ����
	static Object cv = new Object() {void method(){}};	//�͸� Ŭ����
	
	void myMethod() {
		Object lv = new Object() {void method(){}};		//�͸� Ŭ����
	}
}
