//142
package com10.generic;

class U<A extends Number> {

}

public class Manager12 {
	public static void main(String[] args) {
		U<Byte> u1 = new U<Byte>();
		U<Short> u2 = new U<Short>();
		U<Integer> u3 = new U<Integer>();
		U<Long> u4 = new U<Long>();
		U<Float> u5 = new U<Float>();
		U<Double> u6 = new U<Double>();

		// U<String> u7 = new U<String>();
		System.out.println("done");
	}
}

/*
-- U extends Number - 
-- while creating the object of Class U we can able to supply either of either Number of subclass of Number.
*/