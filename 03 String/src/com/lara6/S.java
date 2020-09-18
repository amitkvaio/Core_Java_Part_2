package com.lara6;
import java.text.DateFormat;
import java.util.Date;

public class S {
	public static void main(String[] args) {
		Date d1 = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}

//   4/14/14