package Ŭ�����Ͱ�ü;

class Tv{
	String color="";
	boolean power=false;
	int channel=0;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

public class TvTest {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.channel=10;
		t.channelDown();
		System.out.println("�� ä���� " + t.channel + "���Դϴ�.");
	}
}
