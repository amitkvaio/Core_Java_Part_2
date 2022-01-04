//95
package com06.set;

import java.util.HashSet;

class E {
	int i;

	E(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return " " + i;
	}

	@Override
	public int hashCode() {
		return Integer.toString(i).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		return i == ((E) obj).i;
	}

}

public class Manager19 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new E(9));
		set.add(new E(9));
		set.add(new E(90));
		set.add(new E(90));
		set.add(new E(5));
		set.add(new E(5));
		System.out.println(set);
	}
}
/*
--  in the  classes E - equal() and hashcode() method
	both method are override, due to that HashSet is able
	to identify the duplicate object.
*/