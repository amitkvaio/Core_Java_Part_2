/*
Conversion of ArrayList to String array by using toArray( T )
public abstract <T extends java/lang/Object> T[] toArray(T[]);
*/
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager43 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(90);
		list.add(0);
		list.add(9);
		list.add(91);
		list.add(8);
		list.add(7);
		System.out.println("Printing ArrayList :" + list);

		Integer[] st = new Integer[list.size()];
		list.toArray(st);
		System.out.println("Printing Integer Arrasy : " + Arrays.toString(st));
	}
}
