package com.lara;

public class M12 {
	public static void main(String[] args) {
		boolean b1 = false;
		String s1 = "true";
		String s2 = "abc";

		Boolean b2 = Boolean.valueOf(b1);// boxing into wrapper type
		Boolean b3 = Boolean.valueOf(s1);
		Boolean b4 = Boolean.valueOf(s2);

		boolean b5 = b2.booleanValue();// un-boxing into primitive type
		boolean b6 = b3.booleanValue();
		boolean b7 = b4.booleanValue();

		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
	}

}
