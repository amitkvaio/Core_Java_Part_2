//161
package com01.lara;

import java.io.File;

public class O
{
	public static void main(String[] args)
	{
		File f1 = new File("abc");
		File f2 = new File("abc/hello.txt");
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		System.out.println(f2.isDirectory());
		System.out.println(f2.isFile());
		System.out.println("done");
	}
}
/*

-- f1.isDirectory() - checking whether given name is directory or not if yes - return true - if not return false
-- isFile () - checking whether given name is file or not if yes - return true - if not return false
*/