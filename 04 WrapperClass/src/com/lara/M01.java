package com.lara;

public class M01 {
	public static void main(String[] args) {
		int i = 10;
		Integer obj = new Integer(i);
		System.out.println(obj.toString());
		System.out.println("fa" + obj);

		int K = obj.intValue();
		System.out.println(K);
		System.out.println("done");
	}
}
