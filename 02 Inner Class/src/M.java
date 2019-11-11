
public class M
{
	public static void main(String[] args)
	{
		class A
		{
			void test()
			{
				System.out.println("1111");
				System.out.println("1111");
				System.out.println("1111");
			}
		}
		
		A a1 = new A();
		a1.test();
		System.out.println("...........");
		a1.test();
		System.out.println("...........");
		a1.test();
	}
}

/*

Here we are achieving the security because common statement is getting
used inside the main method only

*/