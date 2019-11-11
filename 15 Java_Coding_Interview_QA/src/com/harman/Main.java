package com.harman;

class Basee{
	public void print() {
		System.out.println("Basee");
	}
}

class Derived extends Basee{
	public void print() {
		System.out.println("Devrived");
	}
}

public class Main {
	public static void DoPrint(Basee o) {
		o.print();
	}
	
	public static void main(String[] args) {
		Basee x  =new Basee();
		Basee y = new Derived();
		Derived z = new Derived();
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
	}
}
