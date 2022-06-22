package com04.lara;

import java.io.*;

class B implements Serializable {
	int i;
	double j;
	String s1;
	Boolean flag;
}

public class Manager2 {
	public static void main(String[] args) throws Exception {

		doExternalize();
		doDeExternalize();
	}

	private static void doExternalize() throws Exception {
		B b1 = new B();
		b1.i = 10;
		b1.j = 20.90;
		b1.s1 = "abc";
		b1.flag = true;
		FileOutputStream fout = new FileOutputStream("test1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeInt(b1.i);
		out.writeDouble(b1.j);
		out.writeUTF(b1.s1);
		out.writeBoolean(b1.flag);
		out.flush();
		out.close();
		System.out.println("done");

	}

	private static void doDeExternalize() throws Exception {

		FileInputStream fin = new FileInputStream("test1.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		System.out.println(in.readInt());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readBoolean());
	}

}
