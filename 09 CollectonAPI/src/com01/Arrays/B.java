//2
package com01.Arrays;
public class B {
	public static void main(String[] args) {
		int x[] = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
	}
}
/* x is the integer type array of size 3 which can accommodate 3 integer values
 * every index of the array is having the initialized with default value according to there 
 * data type
 * if the array size is 3 then we can access only the 0,1,2 index of the array values
 * otherwise it compile gives the ArrayIndexoutofbounexception 
 * int x[]=is the only declaration
 * new int[3]= is the definition
 */