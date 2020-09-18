package com.lara6;
import java.util.Date;

public class I {
	public static void main(String[] args) {
		Date d1 = new Date();
		long num = d1.getTime();
		Date d2 = new Date(num - 1000 * 60 * 60 * 24); //subtracting 1 day day to the current time
		Date d3 = new Date(num - 1000 * 60 * 60 * 27 * 7); // subtracting 7 day to the current time
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}
