package Ŭ�����Ͱ�ü;

class Tv2{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

public class TvTest2 {
	public static void main(String[] args) {
		Tv2[] tvArr = new Tv2[3];
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv2();
			tvArr[i].channel = 10 + i;
		}
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println("tvArr["+i+"]�� ä���� " + tvArr[i].channel + "�Դϴ�.");
		}
	}
}
