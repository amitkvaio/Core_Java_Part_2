//123
package com09.deloping.own.ClassDevlopement;

import java.util.ArrayList;

public class Manager01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(90);
		list.add(9.00);
		list.add("abc");
		list.add(true);
		list.add(false);
		list.add('a');
		list.add(50);
		list.add(9.8);
		list.add(9.6);
		list.add(9.3);
		list.add('s');
		System.out.println("list size : " + list.size());
		System.out.println("List:" + list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		Object obj = list.get(20);
		System.out.println(obj);
	}
}
/*
 list.get(20)
 index 20 is not available in the list so JVM will produce the 
java.lang.IndexOutOfBoundsException
*/