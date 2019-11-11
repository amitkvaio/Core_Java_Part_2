package printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class FW00
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("PW00");
		char[]ch = {'A','B','C','D'};
		
		pw.print("AMIT");
		pw.print(true);
		pw.print(false);
		pw.print(ch);
		pw.print(10.23);
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
