package durga;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FW03
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("FW03.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f,false);
		
		fw.write("ranchi:");
		fw.write('A');
		
		fw.flush();
		fw.close();
		System.out.println("done");
	}
}
