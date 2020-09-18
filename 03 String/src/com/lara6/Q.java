package com.lara6;
import java.util.Calendar;
import java.util.Date;

public class Q {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		Date d1 = cal1.getTime();
		System.out.println(d1);
		
		cal1.add(Calendar.MONTH, 10);
		cal2.roll(Calendar.MONTH, 10);
		
		Date d2 = cal1.getTime();
		Date d3 = cal2.getTime();
		
		System.out.println(d2);
		System.out.println(d3);
	}
}
