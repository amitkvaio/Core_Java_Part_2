package com11.mix;

public class Person {
	
	public String name;
	public Person(String name) {
		this.name=name;
		System.out.println("-----Person() Constructor-----");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("------ Person fInalize() method-------------");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
