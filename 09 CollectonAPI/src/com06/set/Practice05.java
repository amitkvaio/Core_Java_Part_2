//Example :-Elimination duplicate objects by using set interface.
package com06.set;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice05 {
	public static void main(String[] args) {
		String[] str = { "ratan", "anu", "sravya", "anu" };
		List<String> list = Arrays.asList(str);
		TreeSet<String> t = new TreeSet<String>(list);
		System.out.println(t);
	}
}
