//180
package com03.lara;

import java.io.*;

class J implements Serializable {
	int x;
}

public class Manager08 {

	public static void main(String[] args) throws Exception {
		J j1 = new J();
		j1.x = 100;
		Util.serialize(j1, "test7.txt");
		System.out.println("-----");
		J j2 = (J) Util.deSerialize("test7.txt");
		System.out.println(j2.x);
	}
}
