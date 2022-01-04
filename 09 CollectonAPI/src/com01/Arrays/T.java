//19
package com01.Arrays;

import java.util.Arrays;

public class T {
	public static void main(String[] args) {
		int[] x = { 10, 5, 0, 40 };
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(x);// calling the toString() method of object class.
		System.out.println(x.toString());
		System.out.println(Arrays.toString(x));
		// calling toString(x) argumented method of array class.
	}
}

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