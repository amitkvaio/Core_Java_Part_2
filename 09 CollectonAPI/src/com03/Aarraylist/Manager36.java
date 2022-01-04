//72 Using ListIterator interface and it is only applicable for List implementor classes
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager36 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(6);
		list.add(34);
		list.add(23);
		list.add(108);
		list.add(35);
		list.add(45);
		list.add(35);
		list.add(56);
		System.out.println(list);
		ListIterator it = list.listIterator();
		while (it.hasNext())// iterating the element left to right
		{
			System.out.print(it.next() + ",");
		}
		System.out.println();
		while (it.hasPrevious())// iterating the element from right to left
		{
			System.out.print(it.previous() + ",");
		}
		System.out.println();
		while (it.hasNext())// again left to right
		{
			System.out.print(it.next() + ",");

		}
		System.out.println();
	}
}
/*
-- For ListIterator we does not have any restriction 
-- its bi direction means - we can iterate the object from right to left and left to right
   any number of times. 
*/