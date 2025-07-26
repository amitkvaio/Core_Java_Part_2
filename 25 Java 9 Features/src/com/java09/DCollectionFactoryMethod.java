package com.java09;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DCollectionFactoryMethod {
	public static void main(String[] args) {
        List<String> list = List.of("Java", "Python", "C++");
        Set<String> set = Set.of("A", "B", "C");
        Map<String, Integer> map = Map.of("Java", 9, "Python", 3);

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
/*
Java 9 introduced convenient factory methods for creating immutable collections (List, Set, Map) easily.

List.of() creates an immutable list.
Set.of() creates an immutable set.
Map.of() creates an immutable map.
These methods are concise and more efficient. 
*/
