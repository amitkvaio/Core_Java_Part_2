package com.nulll;

import java.util.ArrayList;
import java.util.List;

public class Oracle01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		addMore(list);
		System.out.println(list);
	}
	
	public static void addMore(List list) {
		list.add("amit");
	}
/*
What is @transactional
What is propagation transactiona?
what is the difference between load and get?
what is class loader?
what is @qualifier ?
what is first and second lever cache?
What is generic ?
They enable stronger type checks at compile time.
*/
}
