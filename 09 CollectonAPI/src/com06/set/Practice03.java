/*
write a program to insert String & StringBuffer object into TreeSet, 
	where sorting is increasing length order. If two objects are having same length then use alphabetical order
*/package com06.set;

import java.util.Comparator;
import java.util.TreeSet;

class D implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		return str1.compareTo(str2);
		/*int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1>len2) {
			return 1;
		}else if(len1<len2) {
			return -1;
		}else {
			return str1.compareTo(str2);
		}*/
	}
}

public class Practice03 {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new D());
		t.add("ratan");
		t.add(new StringBuffer("sravya"));
		t.add("anu");
		t.add(new StringBuffer("suneelbabu"));
		t.add("sri");
		t.add(null);
		System.out.println(t);
	}
}
