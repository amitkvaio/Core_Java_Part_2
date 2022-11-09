package com11.mix;

import java.util.HashMap;

public class HashMapClient {
	public static void main(String[] args) {
		HashMap<Student, String> map  = new HashMap<Student, String>();
		Student st1 = new Student(1, "Amit");
		Student st2 = new Student(1, "Amit");
		Student st3 = new Student(1, "Amit");
		st1.setName("Kumar");
		map.put(st1, "Student1");
		map.put(st2, "Student2");
		map.put(st3, "Student3");
		
		System.out.println(map);
	}
}
