package durga;

import java.io.File;

public class File08
{
	public static void main(String[] args)
	{
		File f = new File("E:\\imp1");
		
		String[] s = f.list();
		
		for(String s1 :s)
		{
			System.out.println(s1);
		}
		System.out.println("done");
	}
}
