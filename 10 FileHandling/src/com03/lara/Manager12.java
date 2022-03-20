//184
package com03.lara;

import java.io.*;

class P {
	int i = 10;

	P() {
		System.out.println("P()");

	}
}

class Q extends P {
	int j = 20;

	Q() {

		System.out.println("Q()");
	}
}

class R extends Q implements Serializable {
	int k = 30;

	R() {

		System.out.println("R()");
	}
}

public class Manager12 {

	public static void main(String[] args) throws Exception {
		R r1 = new R();
		Util.serialize(r1, "test11.txt");
		System.out.println("-----");
		R r2 = (R) Util.deSerialize("test11.txt");
		System.out.println(r2.i);
		System.out.println(r2.j);
		System.out.println(r2.k);
	}

}
