package coma.tostring;

class D {
	int i;

	D(int i) {
		this.i = i;
	}
}

public class Manager04 {
	public static void main(String[] args) {
		D d1 = new D(90);
		D d2 = new D(990);
		D d3 = d2;
		D d4 = d1;
		System.out.println(d1);
		System.out.println(d4);
		System.out.println("...........");
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("done");
	}
}
//d2 and d3 are pointing the same object of the class D
//d4,d1 are pointing the another object of the class D