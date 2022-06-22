package com04.lara;

import java.io.*;

public class Manager4 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("test3.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeInt(100);
		out.writeDouble(34.9090);
		out.writeUTF("xyz");
		out.flush();
		out.close();
		System.out.println("done");
		FileInputStream fin = new FileInputStream("test3.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		int i = in.readInt();
		double j = in.readDouble();
		String s1 = in.readUTF();
		System.out.println(i);
		System.out.println(j);
		System.out.println(s1);
	}

}
