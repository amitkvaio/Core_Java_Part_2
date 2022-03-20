//115
package com07.map;

import java.util.HashMap;

class P {
	int i;

	public P(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "(i=" + i + ")";
	}
}

class Q {
	int i;

	public Q(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "(i=" + i + ")";
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Q && this.i == ((Q) obj).i);
	}
}

public class Manager39 {
	public static void main1(String[] args) {
		HashMap map = new HashMap();
		map.put(90, "e1");
		map.put(90, "e2");
		map.put("abc", "v1");
		map.put("abc", "v2");
		map.put(new P(9), "hello1");
		map.put(new P(9), "hello2");
		map.put(new Q(9), "hello3");
		map.put(new Q(9), "hello4");
		map.put(new StringBuffer("abc"), "hello5");
		map.put(new StringBuffer("abc"), "hello6");
		System.out.println(map);
	}
	
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new Q(9), "hello3");
		map.put(new Q(9), "hello4");
		map.put(new Q(9), "hello5");
		map.put(new Q(9), "hello6");
		map.put(new Q(9), "hello7");
		System.out.println(map.get(9));
		System.out.println(map);
	}
}
