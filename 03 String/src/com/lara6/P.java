package com.lara6;
import java.util.Calendar;
import java.util.Date;

public class P {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);
		cal.roll(Calendar.DATE, 25);
		Date d2 = cal.getTime();
		System.out.println(d2);
	}
}
/*
	roll=through the roll, after adding the month, year it is rolling in the 
	same month and year;
	add=through the add , after adding the month, year it moves in the next month
	and next year according to the value

*/