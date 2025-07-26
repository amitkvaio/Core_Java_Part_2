package com.lara;

public class M01 {
	public static void main(String[] args) {
		int i = 10;
		Integer obj = i;
		
		System.out.println(obj.toString());
		System.out.println("fa" + obj);

		int K = obj.intValue();
		System.out.println(K+10);
		System.out.println("Done");
	}
}

/*
Summary
Approach			Description
new Integer(90)		❌ Deprecated (Java 9+)
Integer obj = 90;	✅ Preferred via Auto boxing
Integer.valueOf(90)	✅ Explicit and Efficient

Numbers type
byte < short < int < float < long < double 
Byte	Short	Integer FLoat Long Double

char boolean
Char Boolean

*/