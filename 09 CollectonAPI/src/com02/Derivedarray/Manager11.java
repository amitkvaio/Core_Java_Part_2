//35
package com02.Derivedarray;

public class Manager11 {
	public static void main(String[] args) {
		int x[][] = new int[3][2];
		// System.out.println(x[0][2]);
		int y[][] = new int[3][];
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[2][0]);
		System.out.println(x[2][2]);
		// System.out.println(y[1][0]);
	}
}

/*

for inner array size is 2 then we go for only 0 and 1, if we go for 2 (x[2][2]) then it will give AIOBE

new int [3][2], 3 is the outer array size, and 2 is the inner array size

int y[][] = new int [3][];

in this only outer array size is given but inner size in not given 

if we access any of the inner array element then it wil produce NPE
SOP(Y[1][0]);

*/