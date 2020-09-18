package com.lara5;
public class H {
	public static void main(String[] args) {
		String s1 = "pi value:";
		System.out.printf("%s %f", s1, Math.PI);
		System.out.printf("\n%2$f,%1$s", s1, Math.PI);
	}
}
