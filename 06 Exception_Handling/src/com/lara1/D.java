package com.lara1;

public class D
{
	int test1()
	{
		try
		{
			
		}
		catch(ArithmeticException ex)
		{
			
		}
		finally
		{
		//return 200;
		}
		return 100;
	}
/*	
in every flow it will return 100
suppose that there are some return statement inside 
the finally block then return 100 will be unreachable statement
CTS
		
*/	
	int test2()
	{
		try
		{
			//some stmts
		}
		catch(ArithmeticException ex)
		{
			
		}
		finally
		{
			return 30;
		}
	
	}

/*	
=when try execute successfully then control go to finally and return 30.
=if any exception occurs then goto catch block and finally return 30.
=if there is no catch which handle the NFE then flow will be terminating 
but before termination of program it execute the finally block and return 30 to 
its collier.
	
	
*/	
	
//	int test3()
//	{
//		try
//		{
//			
//		}
//		catch(ArithmeticException ex)
//		{
//			
//		}
//		finally
//		{
//			return 30;
//		}
//		return 40;//unreachable statement. CTE
//	
//	}
	
	int test4()
	{
		try
		{
			
		}
		catch(ArithmeticException ex)
		{
			return 40;
		}
		finally
		{
			
		}
		return 40;
	}

/*	
inside try no stmt return 40;
if exception arise then return 40
	
*/
	
//	int test5()
//	{
//		try
//		{
//			return 20;
//		}
//		catch(ArithmeticException ex)
//		{
//			return 30;
//		}
//		finally
//		{
//			//return 5000;
//		}
//		return 40;//unreachable stmt
//	}

/*
= if no exception suppose to it will return 20 but it will replace by 5000 
	with the return statement of finally block
=if exception arise it suppose to it will return 30 but it will replace by 5000 
 	with the return statement of finally block	
 	
 	
 */
	
	
	
//	int test6()
//	{
//		try
//		{
//			return 20;
//		}
//		catch(ArithmeticException ex)
//		{
//			return 30;
//		}
//		finally
//		{
//			return 40;
//		}
//		return 50//unreachable stmt
//	
//	}
}
