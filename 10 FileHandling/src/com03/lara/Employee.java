package com03.lara;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer id;
	private String name;

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	 //define how Serialization process will write objects.
	private void writeObject(ObjectOutputStream os) {
		System.out.println("In, writeObject() method.");
		try {
			os.writeInt(this.id);
			os.writeObject(this.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * define how deSerialization process will read objects.
	 */
	private void readObject(ObjectInputStream ois) {
		System.out.println("In, readObject() method.");
		try {
			this.id = ois.readInt();
			this.name = (String) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
