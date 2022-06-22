package com04.lara;

import java.io.*;

class C implements Serializable {
	int i;
	double j;
	String s1;

}

public class Manager3 {
	public static void main(String[] args) throws Exception {

		doExternalize();
		doDeExternalize();
	}

	private static void doExternalize() throws Exception {
		C c1 = new C();
		c1.i = 10;
		c1.j = 20.0;
		c1.s1 = "abc";
		FileOutputStream fout = new FileOutputStream("test2.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeInt(c1.i);

		out.writeUTF(c1.s1);

		out.flush();
		out.close();
		System.out.println("done");
	}

	private static void doDeExternalize() throws Exception {
		FileInputStream fin = new FileInputStream("test2.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		int i = in.readInt();
		String s1 = in.readUTF();
		System.out.println(i);
		System.out.println(s1);
	}

}
