package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i =10;
	double d;
}
public class Deserializatio
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("amit.txt");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		
		A a = (A)ois.readObject();
		
		System.out.println("a=" + a.i);
		System.out.println("d="+a.d );
		System.out.println("done");
		
		
		
	}
}

