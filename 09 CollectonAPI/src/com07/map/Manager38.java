//114
package com07.map;

import java.util.Hashtable;

public class Manager38 {
	public static void main(String[] args) {
		Hashtable tab = new Hashtable();
		tab.put(null, 200);
		tab.put("we", null);
		tab.put("sd", true);
		System.out.println(tab);
	}
}
/*
 * Null is not allowed for both key & Value , if we are trying to insert null
 * values we will get NullPointerException.
 */