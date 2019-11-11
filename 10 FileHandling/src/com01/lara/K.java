//157
package com01.lara;

import java.io.File;
import java.io.IOException;

public class K
{
	public static void main(String[] args)
	{
		File f1 = new File("F:/lab1");
		f1.mkdir();
		// creating the directory inside the F drive
		File f2 = new File(f1, "hello.txt");
		// inside f drive we are naming the file name hello.txt.
		try
		{
			boolean b1 = f2.createNewFile();// creating hello.txt file
			System.out.println(b1);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
