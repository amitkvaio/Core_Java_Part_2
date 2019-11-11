package printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class PW05
{
	public static void main(String[] args)throws IOException
	{
		PrintWriter pw = new PrintWriter("PW00");
		char[]ch = {'A','B','C','D'};
		
		pw.write(ch);
		pw.write(65);
		pw.write("AMIT");
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
