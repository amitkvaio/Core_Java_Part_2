//109
package com07.map;

import java.util.HashMap;

public class Manager33 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abc", 9000);
		System.out.println(1 + ":" + map);
		map.put("abc", 890);
		System.out.println(2 + ":" + map);
		map.put("abc", 823);
		System.out.println(3 + ":" + map);
	}
}

/*
--Duplicate keys are not allowed but values can be duplicated.
--if we try to enter the duplicate keys it will override the values with the latest one	

*/