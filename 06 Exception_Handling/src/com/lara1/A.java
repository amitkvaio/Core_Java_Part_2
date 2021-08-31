package com.lara1;

public class A
{
	int test(boolean flag)
	{
		return 1000;
	
	}
	
	/*
	 test() will return 1000; CTS
	 */
	int test1(boolean flag)
	{
		if(flag)
		{
			return 10;
		}
		else
		{
			return 20;
		}
	}
	/*
	
	If flag is true then it will return 10
	if flag is fals then it will return 20
	CTS
	*/
	
	/*int test3(boolean flag)
	{
		if(flag)
		{
			return 10;
		}
	}*/
	
	/*
	 IF THE FLAG IS TRUE THEN TEST3() RETURN 10 BUT 
	 IF THE FLAG IS FALSE THEN TEST3() WILL NOT 
	 RETUNR ANY THING BECAUSE THERE IS NOT ELSE
	 BLOC.
	 IT WILL PRODUCE THE CTE
	*/
	
	
	int test4(boolean flag)
	{
		if(flag)
		{
			return 10;
		}
		return 20;
	}
	
	/*
	If flag is true then it will return 10
	if flag is false then it will return 20
	
	*/
//	int test5(boolean flag)
//	{
//		if(flag)
//		{
//			
//		}
//		else
//		{
//			return 20;
//		}
//	}
	
	
	/*
	 If flag is true, but there is no code to return integer value
	if flag is false then it will return 20
	CTE
	 */
	int test6(boolean flag)
	{
		if(flag)
		{
			
		}
		else
		{
			return 20;
		}
		System.out.println("1111");
		return 10;
	}
	
	
	/*
	 If flag is true then it will return 10
	if flag is false then it will return 20
	 */
	
//	int test7(boolean flag)
//	{
//		if(flag)
//		{
//			return 200;
//		}
//		else
//		{
//			return 20;
//		}
//		return 0;//UNREACHABLE STATEMENT
//	}
	
//CTE
}
class A1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		int i = a1.test6(false);
		System.out.println(i);
		System.out.println("done");
	}
}
