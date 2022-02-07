package amitsimplyfiedtutorial.com.Nsort.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class A {
	public static void main(String[] args) {
		 Map<String, Integer> unsortMap = new HashMap<>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("g", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);

	        System.out.print("Original...");
	        System.out.println(unsortMap);
	        
	        //Sort by key
	        Map<String, Integer> result2 = new LinkedHashMap<>();
	        unsortMap.entrySet().stream()
	                .sorted(Map.Entry.comparingByKey())
	                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
	        System.out.println("After sorting based on key Value:"+result2);
	        
	        
	        //Sort by value 
	        Map<String, Integer> result3 = new LinkedHashMap<>();
	        unsortMap.entrySet().stream()
	                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	                .forEachOrdered(x -> result3.put(x.getKey(), x.getValue()));
	        System.out.println("After sorting based on values:"+result3);
	        
	        // if we remove the reversed() method then it will sort in natural order
	        // else it will sort in reverse order	        
	}
}

/*

Steps to sort a Map in Java 8.
Convert a Map into a Stream
Sort it
Collect and return a new LinkedHashMap (keep the order)

*/
