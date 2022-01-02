package Ŭ�����Ͱ�ü;

public class Time {
	private int hour;
	private int minute;
	private float second;
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public float getSecond() {
		return second;
	}
	
	public void setHour(int h) {
		if(h<0 || h>23) return;
		hour=h;
	}
	
	public void setMinute(int m) {
		if(m<0 || m>59) return;
		minute = m;
	}
	
	public void setSecond(float s) {
		if(s<0.0f || s>59.99f) return;
		second = s;
	}
	
	public static void main(String[] args) {
		Time time = new Time();
		
		time.setHour(5);
		time.setMinute(32);
		time.setSecond(49);
		System.out.printf("���� �ð��� %d�� %d�� %.0f���Դϴ�.", time.hour, time.minute, time.second);
	}
}
