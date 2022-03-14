package com.nulll;
//How to make immutable class using Employee and address Class
//https://www.tutorialspoint.com/how-to-create-an-immutable-class-with-mutable-object-references-in-java
public class Oracle02 {
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee("Amit", 34, new Address("Home", "New Madhukam", "Ranchi"));
		Address address = emp.getAddress();
		System.out.println(address);
		
		address.setAddress("Main-road");
		address.setAddressType("Office");
		address.setCity("Hyderabad");
		System.out.println(emp.getAddress());
	}
}
