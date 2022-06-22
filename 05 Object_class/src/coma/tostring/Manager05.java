package coma.tostring;
class E {
	int i, j;

	E(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "E [i=" + i + ", j=" + j + "]";
	}
	
}

public class Manager05 {
	public static void main(String[] args) {
		E e1 = new E(1, 2);
		E e2 = new E(11, 25);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("done");
	}
}
