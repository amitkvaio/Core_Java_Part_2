package printwriter;

import java.io.IOException;
import java.io.PrintWriter;

public class PW04
{
	public static void main(String[] args)throws  IOException
	{
		PrintWriter pw = new PrintWriter("PW00");
		char[]ch = {'A','B','C','D'};
		
		pw.println("AMIT");
		pw.println(true);
		pw.println(false);
		pw.println(ch);
		pw.println(10.23);
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
