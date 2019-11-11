//162 File Writer
package com01.lara;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class P
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("test.txt");
		FileWriter out = new FileWriter(f1);
		out.write('a');
		out.write('k');
		out.write("ranchi:");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
/*
-- 	flush()==> forcefully write the character into  the file if any remaining character are there.
-- 	forcefully injecting if any remaining character are there.
-- 	flush() and close both are mandatory while writing into the file system.
--	FileWriter is the connection between the File to the java program.
-- 	by default we are not getting new line - character for new line is "\n"
Character streams:-
------------------
Program uses character stream to perform input & output of character data. 
	All character stream classes developed based on Reader & Writer classes.

To demonstrate how the character stream works file I/O provided two main classes

FileReader
----------
--	It is used to read the data from source one item at a time.
--	To read the data from source use read() method of FileInputStream class.
		public int read() throws java.io.IOException;
		read() method returns first character Unicode value in the form of integer value.
FileWriter
---------
--	It is used to write the data to destination one item at a time.
--	To write the data to destination use write() method of FileOutputStream class.
		public void write(int unicode) throws java.io.IOException;
		write() method is taking Unicode value of the character as a parameter.

*/