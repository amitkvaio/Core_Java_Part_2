package com.java14;

public class DNullPointerExceptionMessage {
	public static void main(String[] args) {
		String text = null;
        System.out.println(text.length());  // NPE with exact variable name shown
	}
}
/*
Helpful NullPointerException Messages (JVM feature)
Now we get better error messages when a NullPointerException occurs.
*/