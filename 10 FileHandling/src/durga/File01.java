package durga;

import java.io.File;
import java.io.IOException;

public class File01
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("durga.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		
	}
	
}
