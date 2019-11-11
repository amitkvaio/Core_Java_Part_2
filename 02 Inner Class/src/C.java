
public class C
{
	int i;
	static int j;
	class D
	{
		
	}
	
	static class E
	{
		
	}
	void test1()//test1() is non static so we can use every member of the current class.
	{
		i = 1;
		j=2;
		D d1 = new D();
		E e1 = new E();
		test1();
		test2();
		
	}
	
	static void test2()
	{
		//i=1;//i is non static so we can not use it inside the static block.
		//D d1 = new D();//D is non static class so it is not allowed here
		E e1 = new E();
		//test1();//test1() is non static we can not use it here
		test2();
	}
}
