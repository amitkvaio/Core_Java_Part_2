//8
package com01.Arrays;
public class H {
	public static void main(String[] args) {
		int i = 10;
		String x[] = new String[i];
		System.out.println(".......");

		i = 0;
		String y[] = new String[i];
		System.out.println(".......");
		System.out.println(y.length);
		System.out.println(y[0]);
		i = -2;
		String z[] = new String[i];
		System.out.println(".......");
	}
}

/*

.......
.......
Exception in thread "main" java.lang.NegativeArraySizeException
	at com.lara.H.main(H.java:14)

*/