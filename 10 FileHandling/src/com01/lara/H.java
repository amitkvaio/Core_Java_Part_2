//154
package com01.lara;

import java.io.File;

public class H
{

	public static void main(String[] args)
	{
		File f1 = new File("F:/helloo");
		System.out.println(f1.exists());
		boolean b1 = f1.mkdir();
		System.out.println(f1.exists());
		System.out.println(b1);
		System.out.println("done");
	}
}


/*
-- mkdir() method does not required IOException - we can call straight way.
-- it is returing boolean.

*/