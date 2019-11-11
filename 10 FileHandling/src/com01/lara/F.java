//152
package com01.lara;

import java.io.File;
import java.io.IOException;

public class F
{
	public static void main(String[] args)
	{
		File f1 = new File("z:/hello.txt");
		try
		{
			boolean b =f1.createNewFile();
			System.out.println(b);
		} catch (IOException e)
		{
			e.printStackTrace();
		
		}
	}
}

/*
-- what ever path we have specified.
-- if the path is not available then we will get IOException.
*/