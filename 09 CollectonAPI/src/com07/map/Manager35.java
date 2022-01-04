//111
package com07.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Manager35 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("key1", "v1");
		map.put("key2", "v3");
		map.put("key3", "v233");
		map.put("key4", "v22");
		map.put("key5", "v24");

		Set set = map.keySet();
		// set.forEach(m ->System.out.println(m +":"+map.get(m)));
		Iterator it = set.iterator();
		Object key, value;

		while (it.hasNext()) {
			key = it.next();
			value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
/*
-- To get all the keys use keyset() method.
		public java/util/Set<K> keySet();
*/