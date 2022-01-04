//18
package com01.Arrays;

import java.util.Arrays;

public class S {
	public static void main(String[] args) {
		int[] x = { 10, 20, 100, 30, 65 };
		System.out.println(x);
		System.out.println(Arrays.toString(x));// calling toString() of the Arrays class
	}
}

/*
 * toString
public static String toString(int[] a)
Returns a string representation of the contents of the specified array.
The string representation consists of a list of the array's elements,
enclosed in square brackets ("[]"). Adjacent elements are separated by 
the characters ", " (a comma followed by a space). Elements are converted to 
strings as by String.valueOf(int). Returns "null" if a is null.
Parameters:
a - the array whose string representation to return 
Returns:
a string representation of a
Since: 
1.5
 */


/*

static String toString(boolean[] a)

This method returns a string representation of the contents of the specified array of boolean.

98	static String toString(byte[] a)
This method returns a string representation of the contents of the specified array of bytes.
99	static String toString(char[] a)
This method returns a string representation of the contents of the specified array of chars.
100	static String toString(double[] a)
This method returns a string representation of the contents of the specified array of doubles.
101	static String toString(float[] a)
This method returns a string representation of the contents of the specified array of floats.
102	static String toString(int[] a)
This method returns a string representation of the contents of the specified array of ints.
103	static String toString(long[] a)
This method returns a string representation of the contents of the specified array of longs.
104	static String toString(Object[] a)
This method returns a string representation of the contents of the specified array of ints.
105	static String toString(short[] a)
This method returns a string representation of the contents of the specified array of shorts.


*/