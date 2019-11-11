package aic;

public class Manager3
{
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.test1();
		a1.test2();
		System.out.println("**************");
		
		A a2 = new A()
		{
			@Override
			void test2()
			{
				System.out.println("AIC-TEST2");
			}
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
