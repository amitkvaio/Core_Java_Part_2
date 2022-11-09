package fqa;

public class B {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		try {
			System.out.println("In try");
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("In catch");
			throw new ArrayIndexOutOfBoundsException();
		} finally {
			System.out.println("In finally");
			throw new NullPointerException();
		}
	}
}


/*
Initially ArithmeticException will be thrown which is catch by catch block, 
	catch block throws ArrayIndexOutOfBoundsException which is Runtime Exception and 
	actually no need to catch it(same is for ArithmeticException but handler was there so it 
	catch it.) after that finally block is executed and it throws NullPointerException. 
	So the final exception thrown by test() method is NullPointerException


*/