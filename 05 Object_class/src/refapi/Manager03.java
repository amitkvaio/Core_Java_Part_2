package refapi;

class D
{
	
}

public class Manager03
{
	public static void main(String[] args)
	{
		D d1 = new D();
		Class c1 = d1.getClass();
		System.out.println("c1="+c1);
		
		Class c2= null;
		
		try
		{
			c2 = Class.forName("refapi.D");
			System.out.println("c2="+ c2);
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		Class c3 =D.class;
		System.out.println("c3=" + c3);
		
//		System.out.println(c1==c2);
//		System.out.println(c2==c3);
//		System.out.println(c3==c1);
	}
}
