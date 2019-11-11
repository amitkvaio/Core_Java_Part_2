package com.test;

public class Address implements Cloneable {
	public String street;
	public String state;

	public Address(String stree, String state) {
		this.street = stree;
		this.state = state;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + "]";
	}
}
