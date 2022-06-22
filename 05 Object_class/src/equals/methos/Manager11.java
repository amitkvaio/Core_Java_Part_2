package equals.methos;

class L {
	int i;

	L(int i) {
		this.i = i;
	}

	public String toString() {
		return "i=" + i;
	}
}

public class Manager11 {
	public static void main(String[] args) {

		L obj1 = new L(10);
		L obj2 = new L(10);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.i == obj2.i);
		System.out.println(obj1.equals(obj2));
		System.out.println("done");
	}
}
