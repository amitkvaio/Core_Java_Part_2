package com.rst;

class M11 {

}

public class Pract1 {
	public static void main(String[] args) {
		M11 m1 = new M11();
		M11 m2 = new M11();
		System.out.println(m1 == m2);
		M11 m3 = m1;
		System.out.println(m3 == m1);
		System.out.println(m1.equals(m2));
		System.out.println(m3.equals(m1));
	}
}
