package ��¥�ͽð�;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31); //2015�� 1�� 31��
		System.out.println(toString(date));
		date.roll(Calendar.YEAR, 2);
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"�� "+(date.get(Calendar.MONTH)+1)+"�� "+
					date.get(Calendar.DATE)+"��";
	}
}
