//171 - Writing the data to the File System using BF
package com02.lara;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class C
{
	public static void main(String[] args) {
		FileWriter out = null;
		BufferedWriter bout = null;
		try {
			out = new FileWriter("test1.txt");
			bout = new BufferedWriter(out);
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");
			bout.newLine();
			bout.write("hello to all");

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
				if (out != null) {
					out.close();
					out = null;
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("done");
	}
}
