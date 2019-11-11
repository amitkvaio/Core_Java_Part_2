//166
package com01.lara;

import java.io.FileReader;
import java.io.IOException;

public class T
{
	public static void main(String[] args) throws IOException
	{
		FileReader in = new FileReader("test.txt");
		char[] x = new char[5];
		in.read(x);
		String s1 = new String(x);
		System.out.println(x);
	}
}
/*

--	char array size is 5 - so it will read only up to five character to the x array.

*/