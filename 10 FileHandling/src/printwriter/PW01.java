package printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PW01
{
	public static void main(String[] args) throws IOException
	{
		FileWriter  fw = new FileWriter("PW01.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
		char[] c1 = {'Z','Y','X'};
		pw.print('A');
		System.out.println("\n");
		pw.print("amit");
		System.out.println("\n");
		pw.print(10);
		pw.print(10.23);
		pw.print(11.236);
		pw.print(true);
		pw.print(false);
		pw.print(c1);
		pw.print(12.3654879);
		pw.flush();
		pw.close();
		System.out.println("done");
	}
}
