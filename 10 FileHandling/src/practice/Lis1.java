package practice;

import java.io.File;

public class Lis1
{
	public static void main(String[] args)
	{
		File f = new File("E:\\imp1");
		
		for(String s:f.list())
		{
			System.out.println(s);
		}
		
	}
}
