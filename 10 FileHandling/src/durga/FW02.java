package durga;

import java.io.FileWriter;
import java.io.IOException;

public class FW02
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("Fw02.txt", false);
		fw.write("amit");
		fw.write(":kumar");
		fw.write(124);
		fw.flush();
		fw.close();
		System.out.println("done");
	}
}
