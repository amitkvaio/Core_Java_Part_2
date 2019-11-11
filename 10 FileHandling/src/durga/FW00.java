package durga;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FW00
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("ist.txt");
		FileWriter fw  = new FileWriter(f);
		
		fw.write("amit:");
		fw.write("kumar:");
		fw.write("bangalore:");
		fw.write("snmens");
		fw.write(":done");
		fw.flush();
		fw.close();
		System.out.println("done");
		
	}
}
