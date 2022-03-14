package com.lara;

public class M10 {
	public static void main(String[] args) {
		int i = 10;
		String s1 = "20";

		Integer obj1 = Integer.valueOf(i);
		Integer obj2 = Integer.valueOf(s1);

		int m = obj1.intValue();
		int n = obj2.intValue();

		System.out.println("m=" + m);
		System.out.println("n=" + n);

		int o = obj1.intValue();
		Integer p = Integer.valueOf(s1);

		System.out.println("o=" + o);
		System.out.println("p=" + p);
		System.out.println("done");

	}
}
