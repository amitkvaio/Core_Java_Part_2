//175
package com03.lara;

import java.io.*;

class B implements Serializable
{
	int i;
	String s1;
	Boolean flag;

	B(int i, String s1, Boolean flag) {
		this.i = i;
		this.s1 = s1;
		this.flag = flag;
	}

	@Override
	public String toString() {
		return i + "," + s1 + "," + flag;
	}
}

public class Manager02
{
	public static void main(String[] args) throws Exception {
		SerializationDemo();
		//deSerializationDemo();
	}

	public static void SerializationDemo() throws Exception {
		B b1 = new B(10, "abc", true);

		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream("test1.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(b1);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
					out = null;

				}
			} catch (IOException ex) {
				ex.printStackTrace();

			}

			try {
				if (fout != null) {

					fout.close();
					fout = null;

				}
			} catch (IOException ex) {
				ex.printStackTrace();

			}

		}
		System.out.println("Serialization has done successfully!!");

	}

	private static void deSerializationDemo() {
		FileInputStream fin = null;
		ObjectInputStream in = null;
		try {
			fin = new FileInputStream("test1.txt");
			in = new ObjectInputStream(fin);
			B b1 = (B) in.readObject();
			System.out.println(b1);

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();

		} finally {
			try {
				if (in != null) {

					in.close();
					in = null;

				}
			} catch (IOException ex) {
				ex.printStackTrace();

			}
			try {
				if (fin != null) {

					fin.close();
					fin = null;

				}
			} catch (IOException ex) {
				ex.printStackTrace();

			}
		}
	}
}
/*
 * -- Overriding the toString method from the object class in order to print the
 * content of object of class B
 */
