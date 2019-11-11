//159
package com01.lara;

import java.io.File;
import java.io.IOException;

public class M
{
	public static void main(String[] args) throws IOException
	{
		System.out.println(1);
		File f1 = new File("F:/lab1", "abc.txt");
		File f2 = new File("F:/lab1", "test");
		System.out.println(f1.createNewFile());
		System.out.println(f2.mkdir());
		System.out.println("done");
	}
}
/*
-- Inside the F drive - there is a folder lab1 already created, -if not then we need to create.
-- Inside lab1 - abc.txt file will create.
-- inside lab1 also test directory will create.
*/