package com.lara6;
import java.util.Calendar;
import java.util.Date;

public class L {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
