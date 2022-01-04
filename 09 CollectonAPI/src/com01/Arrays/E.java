//5
package com01.Arrays;
public class E {
	public static void main(String[] args) {
		int x[] = new int[3];
		System.out.println(x[3]);
	}

}


/*

we are trying to excess third index of the array x , 
	but third index is not available so it will give exception

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at com.lara.E.main(E.java:8)

*/