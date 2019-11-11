//151
package com01.lara;

import java.io.File;
import java.io.IOException;

public class E
{
	public static void main(String[] args)
	{
		File f1 = new File("D:\\practice\\hello.txt");
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
Note : 
-- While keeping back ward slash we need one more backward slash
-- if it is forward then only one.

*/