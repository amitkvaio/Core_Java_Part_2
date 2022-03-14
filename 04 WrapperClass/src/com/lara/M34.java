package com.lara;

public class M34 {
	static int test() {
		Integer Obj = new Integer(20);
		return Obj;// return obj.intvalue();
	}

	public static void main(String[] args) {
		Integer o1 = test();// new Integer(test());
		System.out.println("o1->" + o1);
	}
}
