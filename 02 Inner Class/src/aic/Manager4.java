package aic;

public class Manager4
{
	public static void main(String[] args)
	{
		A a1 = new A()
		{
			
		};
		a1.test1();
		a1.test2();
		
		System.out.println("1111111111111111111");
		
		A a2 = new A()
		{
			@Override
			void test1()
			{
				System.out.println("AIC-test1()");
			}
		};
		a2.test1();//call the override test1() method
		a2.test2();
		
		System.out.println("2222222222222222222222222");
		
		A a3 = new A()
		{
			@Override
			void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		a3.test1();
		a3.test2();//call the override test2() method
		System.out.println("3333333333333333333333333");
		
		A a4 = new A()
		{
			@Override
			void test1()
			{
				System.out.println("AIC-test1");
			}
			@Override
			void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		a4.test1();//test1 and test2 both are calling overrided method
		a4.test2();
		System.out.println("44444444444444444444444444");
		
		
	}
}
