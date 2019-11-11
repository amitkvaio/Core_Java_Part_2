//173 - Reading and writing the  the binary data to the file;

package com02.lara;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E
{
	public static void main(String[] args) {
		File f1 = new File("D:\\smu.jpeg");

		File f2 = new File("amit.jpeg");

		FileInputStream fin = null;
		FileOutputStream fout = null;

		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;

		try {
			fin = new FileInputStream(f1);
			bin = new BufferedInputStream(fin);
			// Creating the BufferedInputStream Object by passing the FileInputStream as input.
			
			byte[] b = new byte[(int) f1.length()];
			// Creating the byte arrays by passing the length of the file in byte - it is empty byte arrays
			bin.read(b);
			// Reads up to byte.length bytes of data from this input stream [bin] into an array of bytes[b]
			fout = new FileOutputStream(f2);

			bout = new BufferedOutputStream(fout);

			bout.write(b);
			//Writes b.length bytes to this output stream. 
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (bout != null) {
					bout.flush();
					bout.close();
					bout = null;
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}

			try {
				if (fout != null) {
					fout.flush();
					fout.close();
					fout = null;
				}
			} catch (IOException e3) {
				e3.printStackTrace();
			}

			try {
				if (bin != null) {

					bin.close();
					bin = null;
				}

			} catch (IOException e4) {
				e4.printStackTrace();
			}

			try {
				if (fin != null) {
					fin.close();
					fin = null;
				}
			} catch (IOException e5) {
				e5.printStackTrace();
			}

		}
	}
}

/*
--	Image is refereed by f1 - it is the the source file.
--	I want to read the content of f1 into f2. -  f2 is the destination file.
--	BufferedInputStream is used to read the binary data from the file system.
--  BufferedOutputStream is used to write the binary data to the file System.

--	Buffered Streams:-
--	In previous examples we are using un-buffered I/O[FileReader and FileWriter] .
		This means each read and write request is handled directly by the underlying OS.
--	In normal streams each request directly triggers disk access it is relatively expensive.
		and performance is degraded.

--	To overcome above limitations use buffered streams.

--	Buffered input stream read the data from buffered memory and it interacting with hard disk only.
		when buffered memory is empty.

--	Buffered output stream write the data to buffer memory.

--	There are four buffered stream classes.
		Buffered byte streams,
		1. BufferedInputStream
		2. BufferedOutputStream
		A program can convert an un buffered stream into buffered streams.
			--	new BufferedInputStream(new FileInputStream("xanadu.txt"));
			--	new BufferedOutputStream(new FileOutputSream("byteoutput.txt"));

--	Buffered Character streams,

		3. BufferedReader
		4. BufferedWriter
		A program can convert an un buffered stream into buffered streams.
			--	new BufferedReader(new FileReader("ratan.txt"));
			--	new BufferedWriter(new FileWriter("characteroutput.txt"));
		

*/