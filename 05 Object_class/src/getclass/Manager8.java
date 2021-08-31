package getclass;
class M {
	protected void finalize() throws Throwable {
		System.out.println("from finalize");
	}
}

public class Manager8 {
	public static void main(String[] args) throws Throwable {
		Manager8 m1 = new Manager8();
		m1.finalize();
		m1.finalize();
		m1.finalize();
		m1.finalize();
	}
}
