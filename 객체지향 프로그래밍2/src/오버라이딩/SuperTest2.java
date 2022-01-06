package 오버라이딩;

public class SuperTest2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 {
	int x = 10;	
}

class Child2 extends Parent2{
	int x=20;
	
	void method() {
		System.out.println("x="+x); 				//20 (자손클래스의 x를 가리킴)
		System.out.println("this.x="+this.x);		//20 (자손클래스의 x를 가리킴)
		System.out.println("super.x="+super.x);		//10 (부모클래스의 x를 가리킴)
	}
}
