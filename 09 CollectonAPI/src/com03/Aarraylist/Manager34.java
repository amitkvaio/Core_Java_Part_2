//70
package com03.Aarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Manager34 {
	public static void main(String[] args) {
		 //failFastIterator();
		 failSafeIterator();
	}

	public static void failFastIterator() {
		List<Object> list = new ArrayList<>();
		list.add(90);
		list.add(9);
		Iterator<Object> it = list.iterator();
		System.out.println(list);
		while (it.hasNext()) {
			System.out.println(it.next());
			//list.add(99); //concurrentmodificationException - fail-fast
			//list.remove(Integer.valueOf(90));
			System.out.println(it.next());
		}
		list.add("amit");
		System.out.println(list);
	}

	public static void failSafeIterator() {
		CopyOnWriteArrayList<Object> list = new CopyOnWriteArrayList<>();
		list.add(90);
		list.add(9);
		System.out.println(list);
		Iterator<Object> it = list.iterator();
		 
		while (it.hasNext()) {
			list.add(99);
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
		Iterator<String> iterator = cityCode.keySet().iterator();

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