//181
package com03.lara;

import java.io.*;

class K implements Serializable {
	int x;

	K() {
		System.out.println("K()");
	}
}

public class Manager09 {
	public static void main(String[] args) throws Exception {
		K k1 = new K();
		k1.x = 10;
		Util.serialize(k1, "test8.txt");
		System.out.println("-----");
		K k2 = (K) Util.deSerialize("test8.txt");
		System.out.println(k1 == k2);
		System.out.println(k1.x == k2.x);
	}
}
/*
--	Before Serialization object was referred by k1
--	After de -serialization object is  referred by k2
--	Sure both the object reference are different but the data is same.

*/