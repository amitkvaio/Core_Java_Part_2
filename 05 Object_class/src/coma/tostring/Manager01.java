
package coma.tostring;
class A {
	int i;
}

public class Manager01 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 20;
		System.out.println(a1);
		System.out.println("........................");
		System.out.println("toString()=" + a1.toString());
	}
}


/*
internally(a1)compiler  called the toString() method of the Object class
i.e a1.toString();
we are sending object a1 to println method internally it is calling
toString method, which is available in Object Class, so toString()
is inheriting to class A , whose return type is String
this toString method is returning hexadecimal representation ,memory
address of newly created object


*/