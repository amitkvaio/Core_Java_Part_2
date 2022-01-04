//46
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager10 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(12);
		list.add(23);
		list.add(2);
		list.add(34);
		System.out.println(list);
	
		boolean flag = list.remove(new Integer(2));
		System.out.println(flag);
		System.out.println(list);
		flag = list.remove(new Integer(20));// it delete the given object
		System.out.println(flag);
		System.out.println(list);
	}
}
/*
remove() ,first checking either 2 object(not index value) is present in the list 
	or not if yes then it will return true
after that it will delete 2 from the list.

*/