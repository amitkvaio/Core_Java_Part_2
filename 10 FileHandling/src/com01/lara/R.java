//164
package com01.lara;

import java.io.FileWriter;
import java.io.IOException;

public class R
{
	public static void main(String[] args) throws IOException
	{
		FileWriter out = new FileWriter("test1.txt");
		out.write("hello to all11");
		out.write("\nhello to all111");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
/*

--	FileWriter taking the file name as constructor parameter - if the file is not available it will
--	create the respective file and write the data into it - if it is there it will not create

*/