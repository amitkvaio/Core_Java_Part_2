//136
package com10.generic;

class G<E> {
	E attr1;// we can supply any data type.

	G(E attr1, int i) {
		System.out.println("From G()-Constructor - attr1 : " + attr1 + " || i : " + i);
		this.attr1 = attr1;
	}
}

public class Manager06 {
	public static void main(String[] args) {
		G<String> g1 = new G<String>("abc", 20);

		G<Integer> g2 = new G<Integer>(20, 30);

		G<Double> g3 = new G<Double>(10.20, 20);

		System.out.println("done06");
	}
}
/*
attr1 	= Generic type
i		= data type is fixed - not Generic type
*/