//54
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager18 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(90);
		list.add(80);
		list.add(81);
		list.add(25);
		System.out.println(list);
		Comparator ctr = Collections.reverseOrder();
		Collections.sort(list, ctr);
		System.out.println(list);
	}
}
