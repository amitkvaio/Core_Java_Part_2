package comb.equal.hashCode;
class B {
	int i;
}

public class Manager01 {
	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		B b3 = b1;
		b1.i = b2.i = 20;
		System.out.println(b1 == b2);
		System.out.println((b2 == b3));
		System.out.println(b1.i == b2.i);
		System.out.println(b1 == b3);
		int i = 9;
		int j = 9;
		System.out.println(i == j);
	}
}
/*
	== operator checking the both reference of the object are pointing to the same object or not
	if it pointing to the same object then it will return true otherwise it will return false
	and it also check address value are same or not if it is equal then it will return true 
	otherwise it will return false



*/