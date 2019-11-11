package printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PW02
{
	public static void main(String[] args) throws IOException
	{
		FileWriter  fw = new FileWriter("PW02.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		char[] c1 = {'Z','Y','X'};
		pw.println(10);
		pw.println(12.21);
		pw.println(12.365);
		pw.println(false);
		pw.println(c1);
		pw.println(true);
		pw.println("amit");
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
