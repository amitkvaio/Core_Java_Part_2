//149
package com01.lara;

import java.io.File;
import java.io.IOException;

public class C
{
	public static void main(String[] args)
	{
		File f1 = new File("resume.doc");
		try
		{
			System.out.println(f1.createNewFile());
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
/*
-- Main method is not throwing any exception
-- So we need to keep try-catch
-- It is required IOException
-- throws or try-catch with IOExeption.
-- through createNewFile() method we can create any type of file.

*/