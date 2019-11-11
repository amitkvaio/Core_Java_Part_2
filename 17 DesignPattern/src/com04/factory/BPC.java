package com04.factory;

public class BPC implements AComputer {

	private String RAM;
	private String HDD;
	private String CPU;
	private String COLOR;

	
	public BPC(String ram, String hdd, String cpu,String color) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU=cpu;
		this.COLOR=color;
	}
	
	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}

	@Override
	public String getColur() {
		return COLOR;
	}

}
