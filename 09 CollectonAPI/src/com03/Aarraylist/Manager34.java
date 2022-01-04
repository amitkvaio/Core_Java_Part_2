//70
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Manager34 {
	public static void main(String[] args) {
		//failFastIterator();
		 failSafeIterator();
	}

	public static void failFastIterator() {
		List list = new ArrayList<>();
		list.add(90);
		list.add(9);
		Iterator it = list.iterator();
		System.out.println(list);
		while (it.hasNext()) {
			System.out.println(it.next());
			// list.add(99); //concurrentmodificationException - fail-fast
			//list.remove(new Integer(90));
			System.out.println(it.next());
		}
		list.add("amit");
		System.out.println(list);
	}

	public static void failSafeIterator() {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
		list.add(90);
		list.add(9);
		System.out.println(list);
		Iterator it = list.iterator();
		list.add(99); // fail - safe
		list.remove(new Integer(90));
		System.out.println(list);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		list.add("amit");
		System.out.println(list);
	}

	public static void main1(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");
		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}
	}
}
/*
 * --Once we get the iterator object then we can not suppose to add/remove any
 * elements in the list --if we do then we will get
 * concurrentmodificationException. --after the iteration operation we can
 * add/remove the element in the list.
 * 
 */