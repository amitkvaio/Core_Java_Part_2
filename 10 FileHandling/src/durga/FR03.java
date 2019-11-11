package durga;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FR03
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("test.txt");
		FileReader fr = new FileReader(f);
		
		char[] c1 = new char[(int)f.length()];
		fr.read(c1);
		
		String s1 = new String(c1);
		
		System.out.println(s1);
	}
}
