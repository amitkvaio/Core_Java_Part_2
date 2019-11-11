package com04.factory;

public class GClient {
	public static void main(String[] args) {
		try {
			AComputer pc = FComputerFactory.getComputer(EComputerType.PC, "2GB", "500GB", "I3", "Black");
			AComputer lap = FComputerFactory.getComputer(EComputerType.LAPTOP, "8GB", "1TB", "I5", "Silver");
			AComputer ser = FComputerFactory.getComputer(EComputerType.SERVER, "100GB", "100TB", "I6", "NotSpecified");
			System.out.println("======== PC INFORMATION ==========");
			System.out.println(pc.getRAM() + " " + pc.getHDD() + " " + pc.getCPU() + " " + pc.getColur());
			System.out.println("======== LAPTOP INFORMATION ==========");
			System.out.println(lap.getRAM() + " " + lap.getHDD() + " " + lap.getCPU() + " " + lap.getColur());
			System.out.println("======== SERVER INFORMATION ==========");
			System.out.println(ser.getRAM() + " " + ser.getHDD() + " " + ser.getCPU() + " " + ser.getColur());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
When to use Factory design pattern in Java
---------------------------------------------
Static Factory methods are common in frameworks where library code needs to create objects of types 
which may be sub classed by applications using the framework.        

Some or all concrete products can be created in multiple ways, or we want to leave open the option 
that in the future there may be new ways to create the concrete product.

Factory method is used when Products don't need to know how they are created.

We  can use factory pattern where we have to create an object of any one of sub-classes depending on the data provided

*/