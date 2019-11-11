package com07.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Manager40 {
	public static void main(String[] args) {
		Hashtable<String,String> tab = new Hashtable<>();
		tab.put("k1", "e1");
		tab.put("k2", "e2");
		tab.put("k3", "e3");
		tab.put("k4", "e4");
		tab.put("k0", "e0");
		System.out.println(tab);
		
		Set<String>keySet=tab.keySet();
		Iterator<String> it =keySet.iterator();
		while(it.hasNext()) {
			System.out.println(tab.get(it.next()));
		}
		
		String str = "abc";
		int hasCode = str.hashCode();
		int hashstr=hash(hasCode);
		System.out.println("Hashcode:"+hasCode +" hash->"+hashstr);
		int index = indexFor(hashstr, 16);
		System.out.println("Index : "+(hasCode & 15));
		
		//hashstr * (16-1);
	}
	
	static int hash(int h) {
        // This function ensures that hashCodes that differ only by

        // constant multiples at each bit position have a bounded

        // number of collisions (approximately 8 at default load factor).

        h ^= (h >>> 20) ^ (h >>> 12);

        return h ^ (h >>> 7) ^ (h >>> 4);
    }
	
	static int indexFor(int h, int length) { //h- hashNumber , length = table.length
        return h & (length-1);
    }
}
