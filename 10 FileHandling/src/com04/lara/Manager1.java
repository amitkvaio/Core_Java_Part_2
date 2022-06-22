package com04.lara;

import java.io.*;

public class Manager1 {
	public static void main(String[] args) throws Exception {
		A a1 = new A();
		a1.i = 10;
		a1.j = 20;
		FileOutputStream fout = new FileOutputStream("test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeInt(a1.i);
		out.writeDouble(a1.j);
		out.flush();
		out.close();
		System.out.println("done");
		System.out.println("writing is done");
		FileInputStream fin = new FileInputStream("test.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		int p = in.readInt();
		double q = in.readDouble();
		System.out.println("after reading");
		System.out.println(p);
		System.out.println(q);
	}

}
