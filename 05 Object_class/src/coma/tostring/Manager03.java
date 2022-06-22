package coma.tostring;
class C {
	int i;

	C(int i) {
		this.i = i;
		// System.out.println(this.i = i);
	}

	@Override
	public String toString() {
		return "C [i=" + i + "]";
	}
	
}

public class Manager03 {
	public static void main(String[] args) {
		C c1 = new C(90);
		System.out.println(c1);// c1.toString()
		System.out.println(".............");
		System.out.println(c1.toString());
		System.out.println(".........");
		C c2 = new C(20);
		System.out.println(c2);
		System.out.println(c2.toString());
	}
}
//toString() method is override the toString() method of the object class
//so it will give the content.