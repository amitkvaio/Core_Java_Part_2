//153
package com01.lara;

import java.io.File;

public class G
{
	public static void main(String[] args)
	{
		File f1 = new File("abc");
		boolean b1 = f1.mkdir();
		System.out.println(b1);
		System.out.println("done");
	}
}
/*
if the above directory created successfully then f1.mkdir() return true.
and if the above location is not available in the system then it returns false
that is why it does not required try-catch block.
*/