//150
package com01.lara;

import java.io.File;
import java.io.IOException;

public class D
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("D:/test.txt");
		System.out.println(f1.createNewFile());
		System.out.println("done");
	}
}
/*
-- We can create the file any where to the provided absolute path.
-- By default creation of file location is project itself.
*/