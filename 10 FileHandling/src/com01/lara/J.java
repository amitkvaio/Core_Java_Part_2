//156
package com01.lara;

import java.io.File;
import java.io.IOException;

public class J
{
	public static void main(String[] args)
	{
		File f1 = new File("abc");
		f1.mkdir();
		File f2 = new File(f1, "hello.txt");
		try
		{
			System.out.println(f2.createNewFile());
			System.out.println("f1=" + f1);
			System.out.println("f2=" + f2);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
-- f1 referring to abc directory - inside it hello.txt will create

*/