package com04.lara;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable {
	String name;
	int age;
	double weight;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
		out.writeDouble(weight);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
		weight = in.readDouble();

	}
}

public class Manager8 {
	public static void main(String[] args) {
		externalize();
		deExternalize();
	}

	private static void externalize() {
		Person p1 = new Person();
		p1.name = "amit";
		p1.age = 22;
		p1.weight = 45.909;
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream("test7.txt");
			out = new ObjectOutputStream(fout);
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}

			try {
				if (fout != null) {
					fout.flush();
					fout.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	private static void deExternalize() {
		Person p1 = new Person();
		FileInputStream fin = null;
		ObjectInputStream in = null;
		try {
			fin = new FileInputStream("test7.txt");
			in = new ObjectInputStream(fin);
			p1.readExternal(in);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		finally {
			try {
				if (in != null) {
					in.close();
					in = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (fin != null) {
					fin.close();
					fin = null;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.weight);
		System.err.println("done");
	}
}
