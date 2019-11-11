//169
package com02.lara;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("hello to all");
		bw.newLine();
		bw.write("hello to all");
		bw.newLine();
		bw.write("hello to all");
		bw.newLine();
		bw.flush();
		bw.close();
		
		System.out.println("done");
	}
}
/*

--	Line oriented I/O:-
--	In above streams(character) it is possible to read only one item at time.
 	it increases number of read & write operations hence the performance is decreased.
--	To overcome above limitation to improve performance of the application instead of reading the data character
 	by character, read the data line-by-line format to improve the performance.
 	
--	In BufferedWriter there is built in method is there to print the new line.
 		but in FileWriter we are using "\n" explicitly.
--	File reader there is no method to read line by line.
--	FileWriter and FileReader - for character wise operation.
--	BufferedWriter and BufferedReader -  line wise operation.
--	flush() - method should not be called after close() method.
-- on top of FileWriter sun people has developed the BufferedWriter.
*/