package com.lara6;
import java.util.Date;

public class E {
	public static void main(String[] args) {
		Date d1 = new Date(0);
		Date d2 = new Date(1000);
		System.out.println(d1.getTime());
		System.out.println(d2.getTime());
	}
}
/*
 * getTime() returns the long millisecond
 */