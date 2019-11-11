package com.lara1;

public class G
{
	public static void main(String[] args)
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}

	static void test()
	{
		System.out.println(3);
		int i = 10 / 0;
		System.out.println(4);
	}
}


/*

java command giving a call to main method and going to the stack for execution 
and main giving a call  to test() and test() comes inside the stack for execution
now first test() remove the memory then after main method but there is an exception in 
the test() which is not handled.
in order to remove test() method  from the stack we will keep  try and catch block 
indirectly raised exception is propagated into the main () method

*/