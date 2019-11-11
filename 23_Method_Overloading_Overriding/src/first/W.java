package first;

class W
{
	void test()
	{
		System.out.println("from w");
	}
}
class X extends W
{
//	void test()
//	{
//		System.out.println("from w");
//	}
	
	void test(int i)//inside x class test() got overload
	{
		System.out.println(i);
		System.out.println("from x");
	}
	public static void main(String[] args)
	{
		X obj = new X();
		obj.test();
		obj.test(20);
	}
}