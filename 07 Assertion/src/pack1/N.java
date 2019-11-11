package pack1;

public class N
{
	public static void main(String[] args)
	{
		System.out.println(1);
		//assert test();
		System.out.println(2);
	}
	static void test()
	{
		System.out.println(3);
	}
}
/*
here it will produce the CTE because the assert stmt need boolean type 
but test() method is nothing returning.

*/