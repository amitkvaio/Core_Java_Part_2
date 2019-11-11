//148
package com01.lara;

import java.io.File;
import java.io.IOException;

public class B
{
	public static void main(String[] args)
	throws IOException
	{
		File f1 = new File("test.txt");
		System.out.println(f1.exists());//f - return true only if only test.txt is available.
		boolean b1 = f1.createNewFile();
		System.out.println(f1.exists()); 
	}
}

/*
-- f1.exists()
-- checking test.txt file is available or not if available then it will return true other wise it return false.
*/