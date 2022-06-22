package com.clone;

public class C implements Cloneable {

	int i;
	double d;
	String s1;
	Integer obj;

	C(int i, double d, String s1, Integer obj) {
		this.i = i;
		this.d = d;
		this.s1 = s1;
		this.obj = obj;
	}

	public String toString() {
		return "i=" + i + ",d=" + d + ",s1=" + s1 + ",obj=" + obj;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		C c1 = new C(20, 2.8, "abc", 45);
		C c2 = (C) c1.clone();
		System.out.println("C1 Original=" + c1);
		c2.i = 40;
		c2.d = 200.909;
		c2.s1 = "amit";
		c2.obj = 400;
		System.out.println("C1 Original=" + c1);
		System.out.println("C2 Clonned=" + c2);

	}

}

/*
 * 
 * HERE WE ARE ACHIEVING 100% DEEP COPY OPERATION
 */