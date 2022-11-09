
class A2 {
	static {
		System.out.println("THIRD");
	}
}

class B2 extends A2 {
	static {
		System.out.println("SECOND");
	}
}

class C2 extends B2 {
	static {
		System.out.println("FIRST");
	}
}

public class Houtput {
	public static void main(String[] args) {
		C2 c = new C2();
		System.out.println("Finished");
	}
}