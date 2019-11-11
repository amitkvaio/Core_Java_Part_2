package durga;

import java.io.File;

public class File07
{
	public static void main(String[] args)
	{
		File f = new File("lara.txt");
		long lon = f.length();//gives the length including white spaces
		System.out.println(lon);
	}
}
