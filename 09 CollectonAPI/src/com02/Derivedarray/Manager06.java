//30
package com02.Derivedarray;

import java.util.Arrays;

class E implements Comparable {
	int i, j;

	E(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "E [i=" + i + ", j=" + j + "]";
	}

	public int compareTo(Object obj) {
		E e1 = (E) obj;
		// shorting happen based on the j values
		return this.j - e1.j;
	}
}
public class Manager06{
	public static void main(String[] args)	{
		E x[]={
				new E(20,30),
				new E(90,23),
				new E(87,3),
				new E(6,2),
				new E(3,4)
		};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
