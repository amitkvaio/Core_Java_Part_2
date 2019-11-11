package aic;

public class Manager13
{
	public static void main(String[] args)
	{
		B b1 = method1();
		b1.test1();
		b1.test2();
		
		System.out.println(".................");
		C c1 = method2();
		c1.test1();
		c1.test2(); 
		System.out.println("done");
	}
	static B method1()
	{
		B b1 = new B()
		{
			
			@Override
			void test1()
			{
				System.out.println("AIC-TEST1");
				
			}
		};
		return b1;
	}
	
	
	static C method2()
	{
		return new C()
		{
			@Override
			public void test1()
			{
				System.out.println("AIC-TEST1");
				
			}
			@Override
			public void test2()
			{
				System.out.println("AIC-TEST2");
				
			}
		};
	}
}
