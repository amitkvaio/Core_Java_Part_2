package com.lara6;
import java.text.DateFormat;
import java.util.Date;

public class R {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		DateFormat df = DateFormat.getDateInstance();
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
/*
Mon Apr 14 15:26:44 IST 2014
Apr 14, 2014

*/