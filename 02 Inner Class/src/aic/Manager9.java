package aic;

public class Manager9
{
	public static void main(String[] args)
	{
		C c1 = new C()
		{
			@Override
			public void test2()
			{
				System.out.println("AIC-TEST1");
				
			}
			
			@Override
			public void test1()
			{
				System.out.println("AIC-TEST2");
				
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}

/*
 HERE, C is the interface, so we can not create the object of C interface directly
 here we are creating the subclass of interface C through the AIC
 and overriding the test1 and test2 method.

*/

class Imp implements C
{
	@Override
	public void test1()
	{
		System.out.println("----test1------");
	}
	@Override
	public void test2()
	{
		System.out.println("----test2---");
	}
	
}
