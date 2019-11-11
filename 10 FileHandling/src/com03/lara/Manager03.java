//176
package com03.lara;
import java.io.*;
class C implements Serializable
{
	int i;
	transient final double j;
 
	C(int i,double j)
	{
		this.i=i;
		this.j=j;
 
	}
	@Override
	public String toString()
	{
		return "i="+i+",j="+j;
	}
}

public class Manager03
{
	public static void main(String[] args)throws Exception
	{
		C c1=new C(90,200.90);

		//serializeObject(c1);
		C c2=deSerializeObject();
		System.out.println(c2);
	}

	private static void serializeObject(C c1)throws Exception
	{
		FileOutputStream fout= new FileOutputStream("test2.txt");
		ObjectOutputStream out= new ObjectOutputStream(fout);
		out.writeObject(c1);
		System.out.println("DONE");
	}

	private static C deSerializeObject() throws Exception
	{
		FileInputStream fin=new FileInputStream("test2.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		C c1 = (C) in.readObject();
		return c1;
	}
}
/*

--	Transient Modifiers
	--	Transient modifier is the modifier applicable for only variables and we can’t apply 
			for methods and classes.
	--	At the time of serialization, if we don’t want to save the values of a particular 
			variable to meet security constraints then we should go for transient modifier.
	--	At the time of serialization JVM ignores the original value of transient variable and 
			default value will be serialized

*/
