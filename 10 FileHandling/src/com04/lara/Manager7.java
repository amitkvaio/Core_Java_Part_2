package com04.lara;

import java.io.*;

class F implements Externalizable {
	int i;
	double j;

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(i);
		out.writeDouble(j);

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		i = in.readInt();
		j = in.readDouble();

	}
}

public class Manager7 {
	public static void main(String[] args) throws Exception {
		F f1 = new F();
		f1.i = 10;
		f1.j = 20;
		F f2 = new F();
		f2.i = 20;
		f2.j = 30.9;
		FileOutputStream fout = new FileOutputStream("test6.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		f1.writeExternal(out);
		f2.writeExternal(out);
		out.flush();
		out.close();

		FileInputStream fin = new FileInputStream("test6.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		F f3 = new F();

		f3.readExternal(in);
		F f4 = new F();
		System.out.println(f3.i);
		System.out.println(f3.j);
		System.out.println("------");
		System.out.println(f4.i);
		System.out.println(f4.j);

	}

}
