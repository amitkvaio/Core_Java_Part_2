//159.1 - Practice.
package com01.lara;

import java.io.File;
import java.io.IOException;

public class Mix
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("amit.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f1.delete());
	}
}
/*
-- Creating the amit.txt file and deleting it
*/