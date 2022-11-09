package aic;

public class Test extends A{
	 public Test() {
		 
	}
	
	@Override
	void test2() {
		System.out.println("From test2");
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.test1();
		t.test2();
		
		A test = new Test();
	}
}
