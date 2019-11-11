package bufferedreder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BR02
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr  =new FileReader("test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		int i = br.read();
		
		while(i!= - 1)
		{
			System.out.print((char)i);
			i=br.read();
		}
		
		System.out.println("done");
	}
}
