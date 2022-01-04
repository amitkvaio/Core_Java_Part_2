//57
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.Collections;

class Aa {
	int i;

	Aa(int i) {
		this.i = i;
	}
}

public class Manager21 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(new Aa(90));
		list.add(new Aa(100));
		System.out.println(list);
	}
}






/*
we are not overriding the toString() method in the Aa class
so it will print the memory address.
[90, abc, com03.Aarraylist.Aa@7852e922, com03.Aarraylist.Aa@4e25154f]

*/
