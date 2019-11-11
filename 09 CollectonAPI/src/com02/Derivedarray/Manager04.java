//28
package com02.Derivedarray;

import java.util.Arrays;

class D implements Comparable
//Comparable interface is containing one unimplemented method
//Comparable is in java.lang package
//it contain one copareTo() method
{
	int i;
	D(int i)
	{
		this.i=i;
	}
	
	public String toString()
	{
		//System.out.println("i=" + i);
		return " "+i;
	}
	
	public int compareTo(Object obj)//internally it uses the bubble sort operation
	{
		D d1=(D)obj;
		//return i-d1.i;
		return this.i-d1.i;
	} 
}
public class Manager04
{
	public static void main(String[] args) 
	{
		D x[]={
				new D(9),
				new D(90),
				new D(19),
				new D(29),
				new D(13),
				new D(33),
				};
		
		System.out.println("Before shorting-"+Arrays.toString(x));
		Arrays.sort(x);         //internally call the compareTo method ...
		
		System.out.println(" After shorting-"+Arrays.toString(x));
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