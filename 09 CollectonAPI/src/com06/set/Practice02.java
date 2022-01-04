//write a program to insert StringBuffer data into TreeSet to perform sorting in alphabetical order
package com06.set;

import java.util.Comparator;
import java.util.TreeSet;

class C implements Comparator<StringBuffer> {
	@Override
	public int compare(StringBuffer st1, StringBuffer st2) {
		String str1 = st1.toString();
		String str2 = st2.toString();
		return str1.compareTo(str2);
	}
}

public class Practice02 {
	public static void main(String[] args) {
		TreeSet<StringBuffer> t = new TreeSet<StringBuffer>(new C());
		t.add(new StringBuffer("ccc"));
		t.add(new StringBuffer("aaa"));
		t.add(new StringBuffer("ddd"));
		t.add(new StringBuffer("bbb"));
		System.out.println(t);
	}
}
