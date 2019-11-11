package finalize;

class L {
	protected void finalize() throws Throwable {
		System.out.println("form finalize");
	}
}

class K {
	public static void main(String[] args) {
		L a = new L();
		a = null;
		System.out.println("done");
	}
}
