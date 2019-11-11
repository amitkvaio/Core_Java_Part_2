//155
package com01.lara;

import java.io.File;

public class I
{
	public static void main(String[] args)
	{
		File f1 = new File("Z:/ABC/HELLO/TEST");
		boolean b1 = f1.mkdir();
		System.out.println(b1);
		System.out.println("done");
	}
}
/*
-- if the specified path is not available then mkdir return false rather then generating exception.
*/