package practice;

import java.io.File;

public class Filecount
{
	public static void main(String[] args)
	{
		File f = new File("E:\\imp1");
		int count = 0;
		int hid=0;
		int dir=0;
		for(File fi : f.listFiles())
		{
			if(fi.isFile())
			{
				count++;
			}
		}
		System.out.println("total number of files:"+ count);
		System.out.println("............................");
		
		for(File file:f.listFiles())
		{
			if(f.isHidden())
			{
				hid++;
			}
		}
		
		System.out.println("total number of Hidden files:" + hid);
		System.out.println("...................................");
		
		for(File file:f.listFiles())
		{
			if(f.isDirectory())
			{
				dir++;
			}
		}
		System.out.println("directory="+ dir);
		
	}
}
