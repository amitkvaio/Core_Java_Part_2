package aic;

public class Manager7
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
			@Override
			void test2()
			{
				System.out.println("------AIC-TEST2-----");
				super.test2();//calling the super class test2() method
			}
		};
		b1.test1();
		b1.test2();
	}
}
