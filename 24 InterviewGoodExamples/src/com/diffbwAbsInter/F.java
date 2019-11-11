package com.diffbwAbsInter;

public class F extends E{
	 
	public void test4() {
		System.out.println("Overriding test4() method in Class F");
	}
	
	public void test5() {
		System.out.println("Overriding test5() method in Class F");
		
	}
 
	public void test6() {
		System.out.println(" test6() method in Class F");
	}
	public static void main(String[] args) {
		D d = new E();
		d.test1();
		d.test2();
		System.out.println("-----------1-----");
		D d1 = new F();
		d1.test1();
		d1.test2();
		System.out.println("-----2-----");
		
		E e1 = new F();
		e1.test1();
		e1.test2();
		e1.test3();
		System.out.println("-------3------");
		F f = new F();
		f.test1();
		f.test2();
		f.test3();
		f.test4();
		f.test5();
		f.test6();
		System.out.println("----done----");
		
		
	}
}
