//165
package com01.lara;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class S
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test.txt");
		FileReader in = new FileReader(f1);
		long size = f1.length();
		System.out.println("size of the give file is :" + size);

		char[] x = new char[(int) size];
		in.read(x);
		in.close();
		String s1 = new String(x);
		System.out.println(s1);

	}
}
/*

FileReader
----------
--	It is used to read the data/character from source/File one item at a time.
--	To read the data from source use read() method of FileInputStream class.
		public int read() throws java.io.IOException;
		read() method returns first character Unicode value in the form of integer value.
--	it is reading the data from the file - character wise.
-- 	in.read(x) - all the character is reading into the X arrays.
--	while reading flush is not required - only for writing flush is required.
*/