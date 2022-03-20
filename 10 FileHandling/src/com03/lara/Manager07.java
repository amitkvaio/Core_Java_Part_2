//179
package com03.lara;

import java.io.*;

class I implements Serializable {
	int x;
}

public class Manager07 {

	public static void main(String[] args) throws Exception {
		I obj = new I();
		obj.x = 100;
		Util.serialize(obj, "test6.txt");
		System.out.println("-----");
		Object obj1 = Util.deSerialize("test6.txt");
		I obj2 = (I) obj1;
		System.out.println(obj2.x);
	}
}
