//176.1
package com03.lara;
import java.io.*;

class D implements Serializable {
	int i;
	static int j;
}

public class Manager04 {
	public static void main(String[] args) throws Exception {
		serialize();
		deSerialize();
	}
	private static void serialize() throws Exception {
		D d1 = new D();
		d1.i = 10;
		d1.j = 20;
		FileOutputStream fout = new FileOutputStream("test3.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(d1);
		System.out.println("wrinting is done");
	}
	private static void deSerialize() throws Exception {
		FileInputStream fin = new FileInputStream("test3.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		D d1 = (D) in.readObject();
		System.out.println(d1.i);
		System.out.println("Static:" + d1.j);
	}
}
/*

--	Serialization operation is object operation.
--	Static member are not the part of object - So static member can not be serializing.
--  At the time of serialization JVM ignores the original value of static variable and 
			default value will be serialized.
-- 	output after de serialized.
	10
	Static:20 or Zero - zero if we are running de -serialization in separate execution.
		comment the serialize().
-- 	static member are not storing into the serialization.
--	Serialization and de serialization in the same execution we are getting the 
	value for static variable is 20
--	only one copy of static variable in memory is available.
--  same value of copy of static variable is available as long as execution is continue.
-- 	that is why are getting the static value j =20

*/
