package com04.lara;

import java.io.*;

class D implements Externalizable {
	int i;
	String s1;
	double j;

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeUTF(s1);
		out.writeDouble(j);

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		s1 = in.readUTF();
		j = in.readDouble();
	}
}

public class Manager5 {
	public static void main(String[] args) throws Exception {
		externalize();
		doExternalize();
	}

	private static void externalize() throws Exception {
		D d1 = new D();
		d1.i = 1000;
		d1.j = 4509.908;
		d1.s1 = "abc";
		FileOutputStream fout = new FileOutputStream("test4.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		d1.writeExternal(out);
		out.flush();
		out.close();
	}

	private static void doExternalize() throws Exception {
		D d1 = new D();
		FileInputStream fin = new FileInputStream("test4.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		d1.readExternal(in);
		System.out.println(d1.i);
		System.out.println(d1.j);
		System.out.println(d1.s1);
	}
}
