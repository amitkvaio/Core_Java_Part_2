//107
package com07.map;

import java.util.HashMap;

public class Manager31 {
	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		map1.put("abc", "ravi");
		map1.put('a', 3000);
		map1.put(30, "nan");
		map1.put(null, 900);
		map1.put(1, 200);
		map1.put(1, null);
		map1.put(2, 'n');
		System.out.println(map1);
		System.out.println(map1.get(null));
		System.out.println(map1.get('a'));
		System.out.println(map1.get(1));
	}
}
/*
 --Duplicate keys are not allowed but values can be duplicated.
 --if we try to enter the duplicate keys it will override the values with the latest one	

*/