package com.tricky;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person person = (Person) obj;
		return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
	}

	public static void main(String[] args) {
		Person p1 = new Person("firstName1", "lastName1");
		Person p2 = new Person("firstName2", "lastName2");

		Set<Person> treeSet = new TreeSet<>();
		treeSet.add(p2);
		treeSet.add(null);
		treeSet.add(p1);

		for (Person person : treeSet) {
			System.out.println(person);
		}
	}
}
