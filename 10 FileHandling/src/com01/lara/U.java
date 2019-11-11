//167
package com01.lara;

import java.io.FileWriter;
import java.io.IOException;

public class U
{
	public static void main(String[] args)
	{
		FileWriter out = null;
		try
		{
			// FileWriter out = null;
			out = new FileWriter("test.txt");
			out.write("hello123\njava and");
			System.out.println("done");
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				if (out != null)
				{
					out.flush();
					out.close();
					out = null;
				}
			} catch (IOException e2)
			{
				e2.printStackTrace();
			}
		}
	}
}
/*
--	Instead of using throws we can use try catch with IOException.
--	From the java program FileWriter is external resource
-- 	Once used is got over close it - before try declare it - inside the try use it - 
	close it inside the finally block.
-- 	Finally block is mandatory to execute.
-- 	to use local variable inside the try and finally then we have to declare it before the try.
--	if(out!=null) -before flush and close we need to check out whether out has been initialized or not.
		if it is not then it will throws NullPointerException.
		So to avoid NullPointerException we have to check it out - it is null or not.
		if not flush and close it otherwise it is not required.
--	flush()==>forcefully write the character if any remaining character are there.
--	forcefully injecting if any remaining character are there.
--	flush() and close both are mandatory while writing into the file system.

*/