//28
package com02.Derivedarray;

import java.util.Arrays;

class D implements Comparable
//Comparable interface is containing one unimplemented method
//Comparable is in java.lang package
//it contain one copareTo(Object obj) method
{
	int i;

	D(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "D [i=" + i + "]";
	}
	 
	@Override
	public int compareTo(Object obj) {
		D d = (D)obj;
		return this.i-d.i;
	}
	
}

public class Manager04 {
	public static void main(String[] args) {
		D x[] = { new D(9), new D(90), new D(19), new D(29), new D(13), new D(33), };

		System.out.println("Before shorting-" + Arrays.toString(x));
		Arrays.sort(x); // internally call the compareTo method ...

		System.out.println(" After shorting-" + Arrays.toString(x));
		System.out.println(x.length);
	}
}

/*
internally sort method calling compareTo() method based on element it is taking the decision
calling an reference of an array taking the first element calling CompareTo() method 
passing 1 element
passing 2 element
passing 3 element

*/