package over;

abstract class X
{
	abstract void test1();
}
abstract class Y extends X
{
	//test2(int i);//not like that, because it is the concreate method so body is required is required.
	void test1()
	{
		
	}
	 
}
