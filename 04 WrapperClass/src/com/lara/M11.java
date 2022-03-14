package com.lara;

public class M11 {
	public static void main(String[] args) {
		double d1 = 45.987;
		String s1 = "67.9898";
		Double d2 = Double.valueOf(d1);
		Double d3 = Double.valueOf(s1);

		double d4 = d2.doubleValue();
		double d5 = d3.doubleValue();

		System.out.println(d4);
		System.out.println(d5);
		System.out.println("done");
	}
}
