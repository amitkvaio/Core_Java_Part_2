
public class A
{
	int i;// can be used inside non static block, if 
	//we want to use inside static block then we required referenced variable .e.i we need object
	static int j;//can be used any where
	void test1()//cts
	{
		i = 20;
		j=30;
		test1();
		test2();
	}
	
	static void test2()
	{
		//i = 20;//non static we can not use st way
		j= 30;
		//test1();//non static method we can not use st way
		test2();
	}
}

