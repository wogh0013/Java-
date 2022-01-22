package 지네릭스;

public class AnnotationEx {
	
}

class Parent{
	void parentMethod() {}
}

class Child extends Parent{
	@Override
	void parentMethod() {};
}
