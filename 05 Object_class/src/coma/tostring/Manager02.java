package coma.tostring;
class B {
	int i;

	B(int i) {
		this.i = i;
		System.out.println(i);
	}
}

public class Manager02 {
	public static void main(String[] args) {
		B b1 = new B(10);
		String s1 = b1.toString();
		// we are explicit include the toString() method of the object class
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println("..................");
		System.out.println(b1.toString());
		System.out.println(b1);
	}
}
