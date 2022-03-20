//185
package com03.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Util {
	public static void serialize(Object obj, String file) throws IOException {
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(obj);

	}

	public static Object deSerialize(String file) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream(file);
		ObjectInputStream in = new ObjectInputStream(fin);
		Object obj = in.readObject();
		return obj;
	}

}
