package com.prac;

public class A {
	public static void main(String[] args) {
		short s = 10;
		byte b = 20;
		int i = 30;
		float f = 40;
		long l = 50;
		double d = 60.56;

		boolean bo = true;

		char ch = 'a';

		Short s1 = new Short(s);
		Byte b1 = new Byte(b);
		Integer i1 = new Integer(i);
		Float f1 = new Float(f);
		Long l1 = new Long(l);
		Double d1 = new Double(d);

		Boolean bo1 = new Boolean(bo);

		Character ch1 = new Character(ch);

		short s2 = s1.shortValue();
		byte b2 = b1.byteValue();
		int i2 = i1.intValue();
		float f2 = f1.floatValue();
		long l2 = f1.longValue();
		double d2 = d1.doubleValue();

		boolean bo2 = bo1.booleanValue();
		char ch2 = ch1.charValue();

		System.out.println("s2=" + s2);
		System.out.println("b2=" + b2);
		System.out.println("i2=" + i2);
		System.out.println("f2=" + f2);
		System.out.println("l2=" + l2);
		System.out.println("d2=" + d2);

		System.out.println("bo2=" + bo2);

		System.out.println("ch2=" + ch2);
		System.out.println("done");

	}
}
