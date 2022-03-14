package com.lara;

public class M03 {
	public static void main(String[] args) {
		char c1 = 'a';
		Character c2 = new Character(c1);
		char c3 = c2.charValue();
		System.out.println(c2.charValue());
		System.out.println(c2.hashCode());
		System.out.println(c2.toString());

		System.out.println(c3);
		System.out.println("done");
	}

}
