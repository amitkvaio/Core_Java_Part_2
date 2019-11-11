//174 - Serialization
package com03.lara;

import java.io.*;

class A implements Serializable
{
	private static final long serialVersionUID = 11L;
	int i;
	double j;
	
	public A(){
		System.out.println("-------- A() Constructor ------");
	}
}

public class Manager01
{
	public static void main(String[] args) throws Exception {
		//doSerialization();
		doDeSerialization();
	}

	public static void doSerialization() throws Exception {
		A a1 = new A();
		a1.i = 10;
		a1.j = 10.9;
		FileOutputStream fout = new FileOutputStream("test.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.flush();
		out.close();
		System.out.println("Wrote into file");
	}

	private static void doDeSerialization() throws Exception {
		FileInputStream fin = new FileInputStream("test.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A) in.readObject();
		System.out.println(a1.i);
		System.out.println(a1.j);
	}

}
	
/*	
--	class A is eligible for serialization .
--	Writing the object data or state into the persistent media is known as serialization.
-- 	Persistent media is nothing but file or memory - it can be data base also.
-- 	Serializable is a marker interface (has no data member and method). 
--	It is used to “mark” java classes so that objects of these classes may get certain capability.
-- 	de serializaiton is the opposite of serialization.
-- 	Reading the object state from the persistent media.

-- 	Serialization is unsecured operation - we are writing object state into the memory 
	to the persistent media and it is unsecured operation.
	-- 	Serialization is one of the unsecured operation.
	--	By default JRE is not allowed to run any of the unsecured operation.
	--	to do the unsecured operation object should have a mark.
	--	That mark has provided by one of the marker interface that marker interface is Serializable
	-- 	Serializable is one of the marker interface and it does not have any method.

--	Serialization:-
--	The process of saving an object to a file (or) the process of sending an object across the 
		network is called serialization.
--	Or It is the process of converting the object from java supported form to the network 
		supported form of file supported form.

--	To do the serialization we required following classes
			1. FileOutputStream
			2. ObjectOutputStream
			outputStream.writeObject(c1); - c1 is the serialized object
--	Deserialization:-
--	The process of reading the object from file supported form or network supported form to the 
		java supported form is called deserialization.
--	We can achieve the deserialization by using fallowing classes.
		1. FileInputStream
		2. ObjectInputStream
		objectInputStream.readObject(); - used to deserialized the respective object
*/
