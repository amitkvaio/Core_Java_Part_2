//97
package com06.set;

import java.util.HashSet;

class G {
	int i, j;

	G(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int hashCode() {
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int i = s1.hashCode();
		i += s2.hashCode();
		return i;
	}

	public String toString() {
		return "(" + i + "," + j + ")";
	}

	public boolean equals(Object obj) {
		System.out.println("equals");
		return (this.i == ((G) obj).i && this.j == ((G) obj).j);
	}
}

public class Manager21 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new G(1, 1));
		set.add(new G(1, 1));
		set.add(new G(2, 1));
		set.add(new G(1, 2));
		System.out.println(set);
		System.out.println(set.size());

	}
}

/*
 * -- comparing first hash number with the second hash number, if both are same
 * or equal -- than it is calling equal method if it is returning true then it
 * will not add if it false than it will add the object to the HashSet. -- if
 * the objects are different on the hash number than no need to call the equal
 * method it will add the respective object or elements successful.
 * 
 */