//172 - Reading the data from the file System - using BufferedReader
package com02.lara;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class D
{
	public static void main(String[] args) {
		File f1 = new File("test1.txt");
		FileReader fin = null;
		BufferedReader bin = null;
		try {
			fin = new FileReader(f1);
			bin = new BufferedReader(fin);
			String s1 = bin.readLine();
			while (s1 != null) {
				System.out.println(s1);
				s1 = bin.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				if (bin != null) {

					bin.close();
					bin = null;
				}

			} catch (IOException e2) {
				e2.printStackTrace();
			}

			try {
				if (fin != null) {
					fin.close();
					fin = null;
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
