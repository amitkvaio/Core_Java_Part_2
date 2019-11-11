//170
package com02.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class B
{
	public static void main(String[] args) throws IOException
	{
		FileReader in = new FileReader("test.txt");
		BufferedReader bin = new BufferedReader(in);
		String s1 = bin.readLine();
		while (s1 != null)
		{
			System.out.println(s1);
			s1 = bin.readLine();
		}
		bin.close();
		in.close();
		System.out.println("done");
	}
}
/*

-- On top of FileReader use BufferedReader.

--	BufferedReader
--	It is used to read the data from source file in line by line format.
--	To read the data use readLine() method of BufferedReader class .
		public java.lang.String readLine() throws java.io.IOException;
		The readLine() method returns first line of the text file in the form of String.
-- 	We do not required character array over here - Read the first line use it through while loop.
--	s1 = bin.readLine() - checking the availability of new line in the BufferedReader object.
*/