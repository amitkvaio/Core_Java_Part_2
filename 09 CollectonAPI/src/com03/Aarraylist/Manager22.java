//58
package com03.Aarraylist;

import java.util.ArrayList;

class Ba {
	int i;

	Ba(int i) {
		this.i = i;
	}

	public String toString() {
		return " " + i;
	}
}

public class Manager22 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Ba(90));// calling toString() of the Ba class.
		list.add(new Ba(100));
		list.add(200);// calling toString() of the Arraylist class
		list.add(100);
		list.add(new Ba(8));
		System.out.println(list);
	}
}






/*
we are  overriding the toString() method in the Ba class
so it will print the content of the Ba object.
[ 90,  100, 200, 100,  8]

*/


