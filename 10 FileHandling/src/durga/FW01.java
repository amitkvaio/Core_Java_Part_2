package durga;

import java.io.FileWriter;
import java.io.IOException;

public class FW01
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("FW01.txt");////frist type of construction taking the direct file name
		fw.write("ranchi:");
		fw.write(97);
		fw.write(":amit:");
		fw.flush();
		fw.close();
		System.out.println("done");
	}
}
