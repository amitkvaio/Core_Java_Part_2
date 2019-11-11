package getclass;

class B {

}

public class Manager1 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();

		Class c1 = b1.getClass();
		Class c2 = b2.getClass();
		Class c3 = b3.getClass();
		Class c4 = b4.getClass();

		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c3 == c4);
		System.out.println(c4 == c1);
	}
}

/*
 getting the Class Object of B class.
 for every object of class B is Class object is same.
 for B class java.lang CLASS object is same for every object of B class
 
 */
