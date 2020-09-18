package com.lara6;
import java.util.Calendar;
import java.util.Date;

public class J {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
/*
Calendar is the abstract class
we can not create the object of calendar straight way
by using new operator
we can create the object of calendar by using getInstace();
getInstace() returning date Object 
by default calendar is pointing System Date

*/