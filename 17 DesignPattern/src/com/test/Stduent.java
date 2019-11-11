package com.test;

final public class Stduent {
	private String name;
	private int age;
	private Address address;

	public Stduent(String name, int age, Address ad) {
		this.name = name;
		this.age = age;
		this.address = ad;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		Address add = null;
		try {
			add = (Address)address.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return add;
	}
	
	@Override
	public String toString() {
		return "Stduent [name=" + name + ", age=" + age + ", ad=" + address + "]";
	}

}
