//182
package com03.lara;

import java.io.*;

class L implements Serializable {
	int x;
}

public class Manager10 {
	public static void main(String[] args) throws Exception {
		L obj1 = new L();
		obj1.x = 100;
		Util.serialize(obj1, "test9.txt");
		System.out.println("-----");

		L obj2 = (L) Util.deSerialize("test9.txt");
		System.out.println(obj2.x);

		obj2.x = 200;
		System.out.println(obj1.x);
		obj2.x = 300;
		System.out.println(obj2.x);
	}
}

/*

-- 	Modification of one object is not effecting to another object.
--	It is known as deep copy.

*/