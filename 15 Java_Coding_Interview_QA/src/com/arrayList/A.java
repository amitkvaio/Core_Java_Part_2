//1. How to Remove Duplicates from ArrayList in Java
package com.arrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Before Duplicate remove : "+list);
		List<Integer> lis = usingJava8(list);
		System.out.println("After Duplicate remove : "+lis);
		
		
	}
	/*
	1. Using Iterator 
	Approach:
    Get the ArrayList with duplicate values.
    Create another ArrayList.
    Traverse through the first arraylist and store the first appearance of 
    	each element into the second arraylist using contains() method.
    The second ArrayList contains the elements with duplicates removed.

	*/
	public static List<Integer> usingIterator(ArrayList<Integer> list){
		List <Integer> newList = new ArrayList<>();
		for (Integer integer : list) {
			if(!newList.contains(integer)) {
				newList.add(integer);
			}
		}
		return newList;
	}
	
	/*
	2. Using LinkedHashSet

	A better way (both time complexity and ease of implementation wise) is to remove duplicates 
		from an ArrayList is to convert it into a Set that does not allow duplicates. 
		Hence LinkedHashSet is the best option available as this do not allows duplicates 
		as well it preserves the insertion order.
	*/
	public static List<Integer> usingLinkedHashSet(ArrayList<Integer> list){
		Set<Integer> set = new LinkedHashSet<>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		set.clear();
		set=null;
		return list;
	}
	
	/*
	3. Using Java 8 Stream.distinct()

	You can use the distinct() method from the Stream API. 
	The distinct() method return a new Stream without duplicates elements based on the result 
	returned by equals() method, which can be used for further processing. 
	The actual processing of Stream pipeline starts only after calling terminal methods like 
		forEach() or collect().
	Approach:
    Get the ArrayList with duplicate values.
    Create a new List from this ArrayList.
    Using Stream().distinct() method which return distinct object stream.
    convert this object stream into List
	*/
	public static List<Integer> usingJava8(ArrayList<Integer> list){
		 return list.stream().distinct().collect(Collectors.toList());
	}
}
