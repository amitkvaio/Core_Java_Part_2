package aic;

public class Manager6
{
	public static void main(String[] args)
	{
		B b1 = new B()
		{
			@Override
			void test1()
			{
				System.out.println("AIC-TEST1");
			}
		};
		b1.test1();
		b1.test2();
	}
}

/*
here we are creating the object of subclass of B.
and overriding the test1()
*/