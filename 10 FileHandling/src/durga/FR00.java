package durga;

import java.io.FileReader;
import java.io.IOException;

public class FR00
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("test.txt");
		int i = fr.read();//read the first character from the file and it gives unicode value of the first character.
		//if the character is not available then it will retrun "-1".
		System.out.println(i);
	}
}
