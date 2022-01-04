//Conversion of String array to ArrayList (by using asList() method):-
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager42 {
	public static void main(String[] args) {
		String[] str = { "amit", "kumar", "khushboo" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));
		al.add("rakesh");
		al.add("rohit");
		System.out.println(al);
	}
}
