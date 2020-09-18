package com.lara6;
import java.util.Date;

public class D {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d4 = new Date(0);
		Date d2 = new Date(1000 * 60);// adding 60second to the base date and time
		Date d3 = new Date(1000 * 60 * 60);// adding 1hour to the base date
		System.out.println(d1);
		System.out.println(d4);
		System.out.println(d2);
		System.out.println(d3);
	}
}
