package com.coding.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Ex: Program for map() and collect() Method 

public class D {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("amit");
		list.add("kumar");
		list.add("ajit");
		list.add("rakesh");
		list.add("niraj");
		list.add("devansh");
		
		List<String> listUpperCash=list.stream().map(s->(s.toUpperCase())).collect(Collectors.toList());
		System.out.println("Given List Name : "+list);
		System.out.println("UpperCash List Name : "+listUpperCash);
	}
}

/*

Mapping: 
If we want to create a separate new object, for every object present in the collection based on our 
requirement then we should go for map () method of Stream interface. 

public Stream map (Function f); 

Function can be lambda expression also

Ex: 

Stream s = c.stream(); 
Stream s1 = s.map(i-> i+10); 
Once we performed configuration we can process objects by using several methods. 
 
2.Processing 
 
	processing by collect() method
	 	This method collects the elements from the stream and adding to the specified to the collection 
		indicated (specified)by argument. 
	
	Processing by sorted()method 
	Processing by min() and max() methods 
	forEach() method 
	toArray() method 
	Stream.of()method 
*/