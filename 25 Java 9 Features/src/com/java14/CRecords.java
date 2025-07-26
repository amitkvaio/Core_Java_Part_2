package com.java14;

//Preview Features

record Person(String name, int age) {
}

public class CRecords {
	public static void main(String[] args) {
		 Person p = new Person("Amit", 35);
	     System.out.println(p.name());  // Amit
	     System.out.println(p.age());   // 35
	     
	     
	     Person p2 = new Person("Amit", 35);
	     System.out.println(p2);             // Person[name=Amit, age=35]
	     System.out.println(p.equals(p2));  // true
	}
}
/*
A record is a new way to create immutable data classes with less code.
*/