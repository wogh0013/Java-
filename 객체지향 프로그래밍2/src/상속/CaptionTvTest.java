package ���;

class Tv{
	boolean power; //���� ����(on/off)
	int channel;   //ä��
	
	void power() {
		power = !power;
		}
	void channelUp() {
		++channel;
	}
	void chaneelDown() {
		--channel;
	}
}

class CaptionTv extends Tv{
	boolean caption;	//ĸ�ǻ���(on/off)
	void displayCaption(String text) {
		if(caption)		//ĸ�ǻ��°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel=10;		//����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("hello, world");
		ctv.caption = true;	//ĸ��(�ڸ�) ����� �Ҵ�.
		ctv.displayCaption("Hello, World");
	}
}
