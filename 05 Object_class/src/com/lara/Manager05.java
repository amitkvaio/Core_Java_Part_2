package com.lara;

class E
{
	int i,j;
	E(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public String toString()//gives the attribute value.
	{
		//System.out.println("toString()");
		return "i = "+ i +"& j=" + j;
	}
}
public class Manager05
{

	public static void main(String[] args)
	{
		E e1 = new E(1,2);
		E e2 =new E(11,25);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("done");
	}
}
