package durga;

import java.io.File;

public class File03
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("amit");
		boolean b= f.mkdir();
		System.out.println(b);
		
	}
}
