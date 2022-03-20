//178
package com03.lara;

import java.io.*;

class G implements Serializable {
	int i;
}

class H extends G {
	int j;
}

public class Manager06 {
	public static void main(String[] args) throws Exception {
		serialize();
		deSerialize();
	}

	private static void serialize() throws Exception {
		H h1 = new H();
		h1.i = 10;
		h1.j = 20;
		FileOutputStream fout = new FileOutputStream("test5.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(h1);
	}

	private static void deSerialize() throws Exception {
		FileInputStream fin = new FileInputStream("test5.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		H h1 = (H) in.readObject();
		System.out.println(h1.i);
		System.out.println(h1.j);

	}
}
/*

--	If a parent class has implemented Serializable interface, then child class doesn’t need to
     	implement it but vice-versa is not true.
-- 	H class is the subclass of G - G is implementing the Serializable interface.
-- 	H class also getting serilizable.
*/