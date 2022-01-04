//108
package com07.map;

import java.util.HashMap;

public class Manager32 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(null, 100);
		map.put("abc", null);
		map.put("test", "done");
		map.put(null, 1000);
		System.out.println("Map :" + map);
	}
}

/*
--Duplicate keys are not allowed but values can be duplicated.
--if we try to enter the duplicate keys it will override the values with the latest one	
*/


