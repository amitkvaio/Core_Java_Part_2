package com.lara;

public class M15 {
	public static void main(String[] args) {
		int i = 10;
		String s2 = Double.toString(i);
		// String s2=(String)Double.toString(i);
		System.out.println("s2=" + s2);

		double j = 34.09;
		String s3 = Double.toString(j);
		// String s3=(String)Double.toString(j);
		System.out.println("s3=" + s3);

		boolean k = true;
		String s4 = Boolean.toString(k);
		// String s4 =(String)Boolean.toString(k);
		System.out.println("s4=" + s4);

		char c1 = 'f';
		// String s5=Character.toString(c1);
		String s5 = (String) Character.toString(c1);
		System.out.println("s5=" + s5);

	}
}

/*
 * any primitive can be converted into string wrapper class but string can not
 * be converted into char type.
 * 
 */