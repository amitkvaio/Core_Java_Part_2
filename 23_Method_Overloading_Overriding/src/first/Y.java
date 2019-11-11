package first;

class Y
{
	void test()
	{
		System.out.println("from test() Y");
	}
}
class Z extends Y
{
	//int test()
	void test()
	{
		System.out.println("from test() z");
		//return 10;
	}
	public static void main(String[] args)
	{
		Z z = new Z();
		z.test();
		System.out.println("DONE");
		
	}
}
//whenever overriding  of the sub class method should 
//be the same return type of its super class methods.