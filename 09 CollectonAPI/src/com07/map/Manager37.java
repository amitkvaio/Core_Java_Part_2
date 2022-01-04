//113
package com07.map;

import java.util.HashMap;

class M {
	int i;

	M(int i) {
		this.i = i;
	}

	public String toString() {
		return "i :" + i;
	}
}

public class Manager37 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(10, "abc");
		map.put(10, "xyz");
		map.put("k1", 200);
		map.put("k1", "test");
		map.put(new M(10), 100);
		map.put(new M(10), 200);
		System.out.println(map);
	}
}
/*
 * map.put(new M(10), 200); --above values will not be override because JVM not
 * able to identify the duplicate key object of class M because it is not
 * implementing the comparable interface.
 */
