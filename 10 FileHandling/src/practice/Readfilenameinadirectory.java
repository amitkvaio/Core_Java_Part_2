package practice;

import java.io.File;

public class Readfilenameinadirectory
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("E:\\imp1");
		
		String []s = f.list();
		for(String s1:s)
		{
			System.out.println(s1);
		}
		System.out.println("done");
		
	}
}
