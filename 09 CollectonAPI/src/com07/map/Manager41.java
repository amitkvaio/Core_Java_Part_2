package com07.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Manager41 {
	private static Collection<Person> values;
	private Person person;

	public static void main(String[] args) {
		HashMap<String, Person> per = new HashMap<>();
		
		Person p1 = new Person(101, "Raja", "Bangalore", 560041);
		Person p2 = new Person(102, "Amit", "Jharkhand", 834001);
		Person p3 = new Person(103, "Lara", "karnataka", 560067);
		Person p4 = new Person(104, "Mukesh", "Bihar", 560032);
		
		per.put("10001", p1);
		per.put("10002", p2);
		per.put("10003", p3);
		per.put("10004", p4);
		
		values = per.values();
		
		StringBuilder sb = new StringBuilder();
	
		for (Person person : values) {
			sb.append(person.personId);
			sb.append(", ");
		}
		System.out.println(sb);
		System.out.println("*************Second Method**********");
		String personKey = getPersonId(per);
		System.out.println(personKey);
	}
	
	public static String getPersonId(Map<String, Person> perMap) {
		StringBuilder sb = new StringBuilder();
		
		Set<String> keySet = perMap.keySet();
		
		for (String key : keySet) {
			Person person = perMap.get(key);
			sb.append(person.personId).append(", ");
		}
		
		return new String(sb);
	}
}
