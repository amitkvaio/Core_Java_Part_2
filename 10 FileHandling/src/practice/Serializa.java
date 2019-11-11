package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A2 implements Serializable
{
	int i = 10;
	double d;
}
public class Serializa
{
	public static void main(String[] args) throws Exception
	{
		A2 a1 = new A2();
		
		FileOutputStream fos = new FileOutputStream("amit.txt");
		
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		
		oos.writeObject(a1);
		System.out.println("done");
		
		System.out.println("................................");
		
		
		FileInputStream fis = new FileInputStream("amit.txt");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		
		A2 a = (A2)ois.readObject();
		
		System.out.println("a=" + a.i);
		System.out.println("d=" + a.d);
		System.out.println("done");
		
	}
}
