package com04.factory;

public class FComputerFactory {
	public static AComputer getComputer(EComputerType computerType, 
					String ram, String hdd, String cpu, String color) throws ClassNotFoundException {
		AComputer computer = null;
		switch (computerType) {
		case PC:
			computer = new BPC(ram, hdd, cpu, color);
			break;
		case LAPTOP:
			computer = new CLaptop(ram, hdd, cpu, color);
			break;
		case SERVER:
			computer = new DServer(ram, hdd, cpu, color);
			break;
		default:
			throw new ClassNotFoundException(computerType + " is not implemented !!");
		}
		return computer;
	}
}
