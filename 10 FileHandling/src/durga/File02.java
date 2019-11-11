package durga;

import java.io.File;

public class File02
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("durga.doc");
		boolean b = f.createNewFile();
		System.out.println(b);
	}
}
