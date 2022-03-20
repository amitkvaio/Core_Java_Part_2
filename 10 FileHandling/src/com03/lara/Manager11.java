//183
package com03.lara;

import java.io.*;

class M implements Serializable {
	int i;

}

class N implements Serializable {
	M m1;
	int j;
}

public class Manager11 {
	public static void main(String[] args) throws Exception {
		M m1 = new M();
		m1.i = 10;
		N n1 = new N();
		n1.j = 11;
		n1.m1 = m1;
		Util.serialize(n1, "test10.txt");

		N n2 = (N) Util.deSerialize("test10.txt");
		System.out.println(n2.j);
		System.out.println(n2.m1.i);
		System.out.println("----");
		n2.j = 21;
		n2.m1.i = 20;
		System.out.println(n1.j);
		System.out.println(n1.m1.i);
	}
}

/*

--	Even though derived object is also gives the deep copy.
--	Changes in one object not effecting to another object is known as deep copy operation.

*/
