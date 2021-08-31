package comb.equal.hashCode;
class A {
	int i;
}

public class Manager0 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a2.i = 10;
		A a3 = a1;
		System.out.println(a2 == a1);
		System.out.println(a2.i == a1.i);
		System.out.println(a1 == a3);
//		System.out.println("done");
	}
}

/*
whenever reference variable using with the equals operator(==)
it will check both reference variable pointing to the same
object content  or not. if it is pointing the same object content then it will return
true otherwise it will return false
== operator checking the address value is equal or not if it is equal then 
it gives true otherwise it gives false
*/