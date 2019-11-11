package refapi;

public class Prac04
{
	public void test()
	{ 
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException,IllegalAccessException
	{
		Class c1 = Class.forName("refapi.Prac04"); 
		
		Object obj =c1.newInstance();
		
		Prac04 p1 = (Prac04)obj;
		p1.test();
	}
}
