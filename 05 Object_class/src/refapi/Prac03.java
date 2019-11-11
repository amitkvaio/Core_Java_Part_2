package refapi;

public class Prac03
{
	public void test()
	{ 
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException,	IllegalAccessException
	{
		Class c1 = Class.forName("refapi.Prac03"); 
		
		Prac03 pr =(Prac03) c1.newInstance();
		
		pr.test();
	}
}

/*
forName() is a static method of java.lang.Class that loads the .class file of Prac03
into the RAM and returns the Prac03 as an object of class Class. 
c1 contains the reference of Prac03.
 newInstance() method of class Class returns an object of Object class.
 Now, obj1 contains the reference of Hello. Internally, JVM may use new keyword.
 
Class c1 = Class.forName(“Hello”);
Object obj1 = c1.newInstance( ); 
 
 Hello h1 = (Hello) obj1;
 
newInstance( );  throws the exception  InstantiationException,ClassNotFoundException
*/