//168
package com01.lara;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class V
{
	public static void main(String[] args)
	{
		File f1 = new File("test.txt");
		FileReader in = null;
		try
		{
			in = new FileReader(f1);
			char x[] = new char[(int) f1.length()];
			in.read(x);// read the character into x array
			String s1 = new String(x);// converting the content of the X array into The string.
			System.out.println(s1);
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				if (in != null)
				{
					in.close();
					in = null;
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
/*
--	same as ealier program.
*/
