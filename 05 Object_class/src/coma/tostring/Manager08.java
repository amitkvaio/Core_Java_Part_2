package coma.tostring;
class I {
	int i;

	I(int i) {
		this.i = i;
	}
	public String toString() {
		// System.out.println("toString()");
		return "i=" + i;
	}
}

public class Manager08 {
	public static void main(String[] args) {
		I obj = new I(10);
		System.out.println(obj);
		System.out.println("............");
		System.out.println(obj.toString());
		System.out.println(".............");
		String s1 = "hello , " + obj.toString();
		System.out.println(s1);
	}
}
