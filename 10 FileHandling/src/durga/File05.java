package durga;

import java.io.File;
import java.io.IOException;

public class File05
{
	public static void main(String[] args)throws IOException
	{
		File f1 = new File("lara.txt");
		boolean b = f1.createNewFile();
		System.out.println("b="+ b );
		
		boolean b1 = f1.isFile();
		System.out.println("isFile()="+ b1);
		
		boolean b2 = f1.isDirectory();
		System.out.println("isDirectory()="+ b2);
		
		boolean b3 = f1.isHidden();
		System.out.println("isHidden()=" + b3);
		
		System.out.println("done");
		
		
	}
}
