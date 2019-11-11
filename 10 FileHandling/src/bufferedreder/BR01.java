package bufferedreder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BR01
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String st = br.readLine();
		
		while(st!=null)
		{
			System.out.println(st);
			st =br.readLine();
		}
		br.close();
		System.out.println("done");
	}
}
