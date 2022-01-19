package 날짜와시간;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); //2015년 1월 31일
		System.out.println(toString(date));
		date.roll(Calendar.YEAR, 2);
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+
					date.get(Calendar.DATE)+"일";
	}
}
