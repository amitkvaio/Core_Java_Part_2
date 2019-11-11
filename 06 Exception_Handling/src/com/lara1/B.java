package com.lara1;

public class B
{
	int test(String s1)
	{
		try
		{
			
		} 
		catch (NumberFormatException e)
		{
			
		}
		return 20;
	}
	
/*
 inside try block no statement are there so it will never arise the exception so the control
 will not go inside the catch block 
 so method will always return the 20
 */
	int test1(String s1)
	{
		try
		{
			return 1;
			
		}
		catch (NumberFormatException e)
		{
			return 0;
		}
		
	}
//	int test2(String s1)
//	{
//		try
//		{
//			
//		} 
//		catch (NumberFormatException e)
//		{
//			return 0 ; 
//		}
//		
//	}
/*
 inside the try block no code so it will never arise the exception 
 but there is no return statement
 that is why compiler gives CTE
 */
	int test3(String s1)
	{
		try
		{
			
		} 
		catch (NumberFormatException e)
		{
			return 10;
		}
		return 20;
	}
/*
 INSIDE TRY BLOCK NO STMT SO NO EXCEPTION WILL ARSIE, FURTHER THIS TEST3() RETURN 20
 IF SOME CODE INSIDE THE TRY BLOCK , SUPPOSE IT WILL ASISE NFE ON THAT POINT OF TIME
 CONTROL WILL COME INSIDE THE CATCH BLOCK IT WILL RETURN 10 , SO CTS
 */
	
//	int test4(String s1)
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (NumberFormatException e)
//		{
//			
//		}
//	}
/*
inside try if no exception then it will return 20.
if some exception then control comes inside the catch block
but there is no return statement. CTE
*/
	int test5(String s1)
	{
		try
		{
			return 20;
		} 
		catch (NumberFormatException e)
		{
			
		}
		return 30;
	}
	
/*
 
 inside try if no exception then it will return 20.
if some exception then control comes inside the catch block
but there is no return statement then control comes outside of the
catch block then it will return 30 so CTS
 	
*/
//	int test6(String s1)
//	{
//		try
//		{
//			return 20;
//		} 
//		catch (NumberFormatException e)
//		{
//			return 0;
//		}
//		return 30;//unreachable stmt
//	}
}
