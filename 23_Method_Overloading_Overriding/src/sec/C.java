package sec;

class C
{
	double test()
	{
		System.out.println("from test");
		return 20.90;
	}
}
	class D extends C
	{
		//int test()
		double test()//overided method
		{
			System.out.println("from test");
			return 10;
		}
	}

//return type should be the same