//150.1 - Testing practice
package com01.lara;

import java.io.File;
import java.io.IOException;

public class D1
{
	public static void main(String[] args)
	{
		try
		{
			File f1 = new File("E:/test11.html");
			boolean b = f1.createNewFile();
			System.out.println(b);

		} catch (IOException e)
		{
			e.printStackTrace();

		}
		System.out.println("DONE");
	}
}
