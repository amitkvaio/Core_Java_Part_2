//50
package com03.Aarraylist;

import java.util.ArrayList;

public class Manager14 extends ArrayList
{
	public static void main(String[] args) {
		// ArrayList list=new ArrayList();
		Manager14 list = new Manager14();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(12);
		list.add(13);
		list.add(20);
		list.add(26);
		list.add(25);
		System.out.println(list);
		list.removeRange(0, 2);
		System.out.println(list);
	}
}
/*
 * remove the element of 0 and first index , from the list
 * 
 */