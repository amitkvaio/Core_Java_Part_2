package sec;

class X
{
	void test()
	{
		System.out.println("from x");
	}
}
class Y extends X
{
	void test()//properly OR test()
	{
		System.out.println("from y");
		super.test();//calling the super class test() method.
		System.out.println("from y");
	}
	public static void main(String[] args)
	{
		Y obj = new Y();
		obj.test();
	}
}

/*
x class test() got override  in class y

*/