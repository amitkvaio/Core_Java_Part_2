//56
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Manager20 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add("aBc");
		list.add("anv");
		list.add("ass");
		list.add("123");
		list.add("ABC");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
