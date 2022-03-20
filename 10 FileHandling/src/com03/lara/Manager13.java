package com03.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//Customize Serialization process by defining writeObject() method & 
//DeSerialization process by defining readObject() method in java
public class Manager13 {
	public static void main(String[] args) {
		serialization();
		deserilization();
		System.out.println("Done");

	}

	private static void serialization() {
		Employee object1 = new Employee(1, "amy");
		Employee object2 = new Employee(2, "ankit");
		try {
			OutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutput oout = new ObjectOutputStream(fout);
			System.out.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			oout.writeObject(object2);
			fout.close();
			oout.close();
			System.out.println("Object Serialization completed.");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	// Start deSerialization process.
	private static void deserilization() {
		try {
			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out.println("\nDeSerialization process has started, displaying deSerialized employee objects...");
			Employee emp;
			while ((emp = (Employee) oin.readObject()) != null) {
				System.out.println(emp);
			}
			fin.close();
			oin.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Object DeSerialization completed.");
	}
}
