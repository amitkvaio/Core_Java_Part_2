package coma.tostring;
class K {
	int i;

	K(int i) {
		this.i = i;
	}
	public String toString() {
		// return "i="+i;
		String s1 = super.toString();
		// calling the toString() of Object class it will gives the memory
		// representation
		String s2 = "i= " + i;
		return s1 + " , & " + s2;
	}
}

public class Manager09 {
	public static void main(String[] args) {
		K k1 = new K(10);
		System.out.println(k1);
		K k2 = new K(20);
		System.out.println(k2);
		System.out.println("done");
	}
}
