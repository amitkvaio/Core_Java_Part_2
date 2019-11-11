package durga;

import java.io.File;

public class File04
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("amit");
		f.mkdir();
		//File f2 = new File("amit","amit.txt");
		File f2 = new File(f, "amit.txt");
		f2.createNewFile();
		System.out.println("done");
	}
}
