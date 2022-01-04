//65 
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Manager29 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(0);
		list.add(5);
		list.add(5);
		list.add(19);
		list.add(90);
		list.add(29);
		list.add(5);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
/*
Collections.max(list) - max method will give the maximum values in the given arrays
Collections.min(list) - min method will give the minimum values in the given arrays
*/