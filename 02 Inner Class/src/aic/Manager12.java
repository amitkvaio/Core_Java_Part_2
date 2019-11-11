package aic;

public class Manager12
{
	static void method1(B b1)
	{
		b1.test1();
		b1.test2();
	}
	
	static void method2(C c1)
	{
		c1.test1();
		c1.test2();
	}
	
	public static void main(String[] args)
	{
		B b1 = new B()
		{
			
			@Override
			void test1()
			{
				System.out.println("AIC-TEST1----");
				
			}
		};
		
		method1(b1);
		System.out.println("1111111111111111111111111111111");
		
		C c1 = new C()
		{
			
			@Override
			public void test2()
			{
				System.out.println("AIC-TEST2");
				
			}
			
			@Override
			public void test1()
			{
				System.out.println("AIC-TEST2");
				
			}
		};
		method2(c1);
		System.out.println("2222222222222222222222222222222222");
		
		
		method1(new B()
		{
			void test1()
			{
				System.out.println("AIC-TEST1");
			}
		});
		
		System.out.println("333333333333333333333333333333333333");
		
		method2(new C()
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
		});
		System.out.println("444444444444444444444444444444444444");
		System.out.println("DONE");
	}
}
