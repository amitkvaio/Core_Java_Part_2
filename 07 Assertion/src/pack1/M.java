package pack1;

public class M
{
	public static void main(String[] args)
	{
		System.out.println(1);
		//assert test();
		System.out.println(2);
	}
	static int test()
	{
		return 10;
	}
}
/*
assert stmt takes always boolean type but here
test() method is returning int type it 
will produce cte 

*/