// Tricky question  : https://javaconceptoftheday.com/why-128-128-returns-false-in-java/
package com.harman;

public class G {
	public static void main(String[] args) {
		int a = 127, b = 127, c = 100, d = 100, e = 128, f = 128;
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(e == f);
		System.out.println("------Wrapper------");
		Integer r1 = 127, r2 = 127, r3 = 100, r4 = 100, r5 = 128, r6 = 128;
		System.out.println(r1 == r2);
		System.out.println(r3 == r4);
		System.out.println(r5 == r6);
	}
}
