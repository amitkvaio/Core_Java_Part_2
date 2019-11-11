package com.inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		// Assigning ClassB object to ClassB reference
		B b = new B();
		// call dispA() method of ClassA
		b.dispA();
		// call dispB() method of ClassB
		b.dispB();
		
	}

}

class A {
	private String name ="SingleInheritance";
	public void dispA() {
		System.out.println("disp() method of Class A");
	}
	
	private void private1() {
		System.out.println("private1() method of Class A");
	}
}
class B extends A{
	public void dispB()
    {
        System.out.println("disp() method of Class B");
    }
}


/*

Single Inheritance is the simple inheritance of all, When a class extends another class(Only one class) 
then we  call it as Single inheritance. The below diagram represents the single inheritance in java 
where Class B extends only one class Class A. 
Here Class B will be the Sub class and Class A will be one and only Super class.
-- Private members are not inheriting to the sub class.
A
^
|
B
*/