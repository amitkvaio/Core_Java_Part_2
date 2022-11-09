package fqa;

public class A {
	public static void main(String[] args) {
		System.out.println("Value of a :" + test());
	}

	private static int test() {
		int a = 10;
		try {
			return a;
		} catch (Exception e) {
			a = 20;
			System.out.println("a in catch : " + a);
		} finally {
			a = 30;
			System.out.println("a in finally : " + a);
		}
		a = 40;
		System.out.println("a outside try-catch : " + a);
		return a;
	}
}


/*
Why value of a is printed as 10 in main() method?

The order of return statements matters a lot. 
First return statement is encountered in try block, So at this point JVM will take a note of value of "a" and whatever is the value of "a" at this time will be the marked as the return value of method. (JVM marks the value of "a" as value to return and not variable "a" as to return )

At that point value of "a" was 10, so JVM will mark 10 as return value, once the value to return is marked after this JVM has no relation with the variable "a".

After this point whatever is the value of "a" changed in either catch block or finally block will change the value of "a" but not the return value.  

*/