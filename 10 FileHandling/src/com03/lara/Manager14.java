package com03.lara;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

//How can subclass avoid Serialization if its superClass has implemented Serialization 
//interface (Important)?
class Super implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int age;
}

class Sub extends Super {
	private static final long serialVersionUID = 1L;
	private Integer id;

	public Sub(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Sub [id=" + id + "]";
	}

	/*
	 * define how Serialization process will write objects.
	 */
	private void writeObject(ObjectOutputStream os) throws NotSerializableException {
		throw new NotSerializableException("This class cannot be Serialized");
	}
}

public class Manager14 {
	public static void main(String[] args) {
		Sub object1 = new Sub(8);
		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing objects...");
			oout.writeObject(object1);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*

If we note output, subclass was Serializable (as subclass always inherits all features from its parent 
class), for avoiding Serialization in sub-class we defined writeObject() method and 
throwed NotSerializableException() from there

*/
