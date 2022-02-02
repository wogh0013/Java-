package ¶÷´Ù½Ä;

interface PrintString{
	void showPrinting(String str);
}

public class LambdaTest {
	public static void main(String[] args) {
		PrintString lambdaPrint = str -> System.out.println(str);
		lambdaPrint.showPrinting("test");
		
		showMyString(lambdaPrint);
	}
	
	public static void showMyString(PrintString lambda) {
		lambda.showPrinting("test2");
	}
	
	public static PrintString returnPrint() {
		return s -> System.out.println(s + "world");
	}
}
