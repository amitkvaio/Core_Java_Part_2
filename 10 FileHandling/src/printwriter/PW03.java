package printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PW03
{
	public static void main(String[] args) throws IOException
	{
		FileWriter  fw = new FileWriter("PW03.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		char[] c1 = {'Z','Y','X'};
		pw.write(65);
		pw.write(c1);
		pw.println(":println=" + 65);
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
