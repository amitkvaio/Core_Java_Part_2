package durga;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FR05
{
	public static void main(String[] args)
	{
		File f = new File("test.txt");
		
		FileReader fr = null;
		try
		{
			fr = new FileReader(f);
			int i = fr.read();
			while(i!=-1)
			{
				System.out.println((char)i);
				i=fr.read();
			}
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(fr !=null)
				{
					fr.close();
					fr = null;
				}
			} 
			catch (IOException e2)
			{
				
			}
		}
		
	}
}
