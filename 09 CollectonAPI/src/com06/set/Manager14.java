//90
package com06.set;

import java.util.HashSet;

public class Manager14 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set.add(90));
		System.out.println(set);
	}
}
/*
    boolean add(E e): 
    	Used to add the specified element if it is not present, 
    		if it is present then return false and it will not add the elements to the Hashset.
*/
