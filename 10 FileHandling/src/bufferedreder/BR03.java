package bufferedreder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BR03
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("test.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String x = br.readLine();
		
		while(x!=null)
		{
			System.out.println(x);
			x = br.readLine();
		}
		System.out.println(".........");
		System.out.println(x);
	}
}
