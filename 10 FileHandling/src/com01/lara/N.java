//160
package com01.lara;

import java.io.File;

public class N
{
	public static void main(String[] args)
	{
		File f1 = new File("D:/test/b/c/d/e/f/g/h/i/j/lara");
		boolean b1 = f1.mkdirs();
		System.out.println(b1);
		System.out.println("done");
	}
}

/*
-- Chain of directory we can creates by using mkdirs() method.

*/