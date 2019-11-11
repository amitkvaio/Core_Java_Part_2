package durga;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FR02
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("test.txt");
		
		FileReader fr = new FileReader(f);
		
		long i = f.length();
		System.out.println(i);
		
		char[]c1 = new char[(int)f.length()];
		fr.read(c1);
		
		for(char c2 :c1)
		{
			System.out.println(c2);
		}
		
		fr.close();
	}
}
