package com11.mix;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemoManager01 {
	public static void main(String[] args) throws InterruptedException {
		// hashMap();
		System.out.println("************************");
		weekHashMap();
	}

	public static void hashMap() throws InterruptedException {
		HashMap<Person, String> map = new HashMap<Person, String>();
		Person p1 = new Person("Amit");
		Person p2 = new Person("Raja");

		map.put(p1, "Jharkhand");
		map.put(p2, "Bangalore");

		System.out.println("Before:" + map);
		p1 = null;
		p2 = null;
		System.gc();
		// thread sleeps for 4 sec
		Thread.sleep(4000);

		System.out.println("After:" + map);
	}

	public static void weekHashMap() throws InterruptedException {
		WeakHashMap<Person, String> weakHashMap = new WeakHashMap<Person, String>();
		Person p1 = new Person("Amit");
		Person p2 = new Person("Raja");

		weakHashMap.put(p1, "Jharkhand");
		weakHashMap.put(p2, "Karnataka");

		System.out.println("Before:" + weakHashMap);
		p1 = null;
		p2 = null;
		System.gc();
		// thread sleeps for 4 sec
		Thread.sleep(4000);
		System.out.println("After:" + weakHashMap);
	}
}
