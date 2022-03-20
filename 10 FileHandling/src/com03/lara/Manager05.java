//177
package com03.lara;

import java.io.*;

class E implements Serializable {
	int i;

}

class F implements Serializable {
	E e1;
	int j;
}

public class Manager05 {
	public static void main(String[] args) throws Exception {
		 //serialize();
		deSerialize();
	}

	private static void serialize() throws Exception {
		E e1 = new E();
		e1.i = 200;

		F f1 = new F();
		f1.j = 40;
		f1.e1 = e1;

		FileOutputStream fout = new FileOutputStream("test4.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(f1);
		System.out.println("DONE");
	}

	private static void deSerialize() throws Exception {
		FileInputStream fin = new FileInputStream("test4.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		F f1 = (F) in.readObject();
		System.out.println(f1.j);
		System.out.println(f1.e1.i);
	}
}

/*
 * -- to Serialize F object, E class should be implements Serializable
 * interface.
 */
