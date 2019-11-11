package sec;

class M {
	 private void test() {
		System.out.println("from M");
	}
}

class N extends M {
	// public void test()
	// void test()
	  void test()
	// private void test()//not possible
	{
		System.out.println("from N");
	}

	public static void main(String[] args) {
		N n1 = new N();
		n1.test();
		System.out.println("done");
	}
}
/*
if we are overriding the default method into the subclass
then only protected or public is allow or wider to the existing access level
*/