package com03.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class MyCls {
}

class Emp implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private MyCls myClass;

	public Emp(Integer id) {
		this.id = id;
		myClass = new MyCls();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
}

public class Manager16 {
	public static void main(String[] args) {

		Emp object1 = new Emp(8);

		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing objects...");
			oout.writeObject(object1);
			System.out.println("Object Serialization completed.");
			fout.close();
			oout.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//if class is not implements serializable interface then it will throw NotSerializableException is thrown.