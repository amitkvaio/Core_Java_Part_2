package getclass;

class A {

}

public class Manager {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();

		System.out.println(a1 == a2);
		Class c1 = a1.getClass();
		System.out.println("c1=" + c1);
		Class c2 = a2.getClass();
		System.out.println("c2=" + c2);
		System.out.println(c1 == c2);
	}
}

/*
A is a subclass to object class form the object class getClass() calling by a1 and a2

creating the object of A class
creating the Class object of A class by using the reference variable a1

*/