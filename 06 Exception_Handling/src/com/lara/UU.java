package com.lara;

import java.util.Scanner;

public class UU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some thing");
		String s1 = sc.next();
		String  str = test(s1);

		System.out.println("Main=" + str);
	}

	static String test(String s1) {
		String str =null;
		try {
			//str=str+s1;
			Integer.parseInt(s1);
			System.out.println(str+s1);
			return str+s1;
		}

		catch (NumberFormatException ex) {
			System.out.println(ex);
			System.out.println("Catch:->" + str);
			return null+s1;
		} finally {
			System.out.println("Finally->" + str);
			return str+"Rajes";
		}

	}
}
