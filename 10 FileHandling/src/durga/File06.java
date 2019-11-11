package durga;

import java.io.File;
import java.io.IOException;

public class File06
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("ist.doc");
		boolean b1 = f1.createNewFile();
		System.out.println("b1="+ b1);
		System.out.println("done");
		
		boolean b2 = f1.delete();
		System.out.println("b2="+ b2);
		
	}
}
