package com.lara1;

public class C
{
	int test1()
	{
		try
		{
			
		} 
		catch (NullPointerException e)
		{
			
		}
		catch (ArithmeticException e1)
		{
			
		}
		return 10;
	}
/*
no stmt inside the try so it will return 10
 */
	int test2()
	{
		try
		{
			
			return 10;
		} 
		catch (NullPointerException e)
		{
			return 20;
		}
		catch (ArithmeticException e1)
		{
			return 30;
		}
	
	}
//	int test3()
//	{
//		try
//		{
//			
//		} 
//		catch (NullPointerException e)
//		{
//			return 20;
//		}
//		catch (ArithmeticException e1)
//		{
//			return 30;
//		}
//		
//	}
	
/*	
	inside the try block, if the exception is not arise then it should be return some integer value
	but there is no return statement so compiler gives CTE
*/
	int test4()
	{
		try
		{
			//some stmt
		} 
		catch (NullPointerException e)
		{
			return 20;
		}
		catch (ArithmeticException e1)
		{
			return 30;
		}
		return 100;
	}
/*	
inside the try block, if the exception  arise then compatible catch return will be 
executed ,if the exception is not arise then it will return 100
	
*/	
	
//	int test5()
//	{
//		try
//		{
//			//some stmt
//			
//		} 
//		catch (NullPointerException e)
//		{
//			//return 0;
//		}
//		catch (ArithmeticException e1)
//		{
//			return 30;
//		}
//	
//	}
	
/*	
inside the try block, if the exception is not arise then it should be return some integer value
but there is no return statement so compiler gives CTE
*/	
	int test6()
	{
		try
		{
			//some stmt
		} 
		catch (NullPointerException e)
		{
			
		}
		catch (ArithmeticException e1)
		{
			return 30;
		}
		return 1000;
	}
	
/*	
inside the try block, if the exception is not arise then it should be return 1000.
suppose inside the try block there is NPE then compatible catch will be executed but
inside the compatible catch there is no return statement then the control will come outside
of the catch block then it will return 1000 so CTS
	but there is no return statement so compiler gives CTE
*/	
	
//	int test7()
//	{
//		try
//		{
//			//some stmt
//			return 30;
//		} 
//		catch (NullPointerException e)
//		{
//			return 40;
//		}
//		catch (ArithmeticException e1)
//		{
//			return 50;
//		}
//		return 70;//unreachabel stmt
//	}
}
