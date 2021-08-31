package com.lara1;

public class Test {
		public static void main(String[] args) {
		System.out.println(test4());	
		}
		
		static int test4()
		{
			try
			{
				System.out.println(1);
				//return 10;
			}
			catch(ArithmeticException ex)
			{
				return 400;
			}
			finally
			{
				System.out.println("Finally");
				
			}
			System.out.println("done");
			return 100;
		}
}
