package bufferedwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BW01
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("BW01.txt");
		//f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		char[] c1 = {'A','B','C','D'};
		
		bw.write("welcome to bangalore");
		bw.newLine();
		bw.write(c1);
		bw.newLine();
		bw.write(65);
		bw.newLine();
		bw.write("amit kumar");
		bw.flush();
		fw.close();
		System.out.println("done");
		
	}
}
