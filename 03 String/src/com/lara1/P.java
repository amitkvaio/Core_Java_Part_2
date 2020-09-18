package com.lara1;

public class P {
	public static void main(String[] args) {
		String s1 = "  abc xyz ";
		// 0123456
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		// Returns a copy of the string, with leading and trailing
		// whitespace omitted but we are not assign it into another
		// or same string;
		// System.out.println(s1.length());

	}
}

/*
 * Open Declaration String java.lang.String.trim() trim public String trim()
 * Returns a copy of the string, with leading and trailing whitespace omitted.
 */