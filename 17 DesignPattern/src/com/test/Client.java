package com.test;

public class Client {
	public static void main(String[] args) {
		Stduent st = new Stduent("Amit", 30, new Address("Kadugodi", "Karnataka"));
		System.out.println("Before st : "+st);
		
		Address address = st.getAddress();
		address.setState("xyz");
		address.setStreet("Marahthalli");
		
		System.out.println("After st :"+st);
	}
}
