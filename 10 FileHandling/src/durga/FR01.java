package durga;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FR01
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("test.txt");
		
		FileReader fr = new FileReader(f);

		int i = fr.read();
		
		while(i!=-1)
		{
			System.out.println((char)i);
			//System.out.println(i);//unicode values
			i=fr.read();
		}
		fr.close();
	}
}
