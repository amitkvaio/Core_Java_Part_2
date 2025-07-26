//59
package com03.Aarraylist;

import java.util.ArrayList;

class Ca {
	int i;

	Ca(int i) {
		this.i = i;
	}

	public String toString() {
		return " " + i;
	}
}

public class Manager23 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Ca(1));
		list.add(new Ca(67));
		list.add(new Ca(23));
		list.add(new Ca(34));
		list.add(new Ca(36));
		System.out.println(list);
	}
}
/*
 * we are overriding the toString() method in the Ca class so it will print the
 * content of the Ca object. [ 1, 67, 23, 34, 36]
 * 
 */
