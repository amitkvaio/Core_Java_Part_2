package com.prac;

public class B {
	public static void main(String[] args) {
		int i = 12;
		double d = 15.32;

		Integer i1 = Integer.valueOf(i);
		Double d1 = Double.valueOf(d);

		System.out.println(i1);
		System.out.println(d1);
		System.out.println("..........");

		int i2 = i1.intValue();
		double d2 = d1.doubleValue();

		System.out.println(i2);
		System.out.println(d2);
	}
}
