//147 - before 146 - program related to Collection API - Check com10.generic package
package com01.lara;

import java.io.File;
import java.io.IOException;
public class A
{
	public static void main(String[] args)
	throws IOException
	{
		File f1 = new File("abc.txt");
		boolean b1 = f1.createNewFile();
		System.out.println(b1);
		System.out.println("f1="+ f1);
		System.out.println("f1=" + f1.toString());
		System.out.println("path= " + f1.toPath());
		System.out.println("URI:"+f1.toURI());
		System.out.println("URL:"+f1.toURL());
		System.out.println("done");
	}
}
/*
-- f1.createNewFile()
-- if the file is successfully created then createNewFile()return true
	if the file is already available then f1 just pointing to that file and
	it return false.
*/