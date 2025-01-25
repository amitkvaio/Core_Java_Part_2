
public class Test {
	
	final int i =10;
	Test t1 = new Test();
	
	public Test() {
		System.out.println("Test (--) Constructor!");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Main End");
	}
}

/*
Abhimanyu
Test (--) Constructor!
Main End

Ajit
Stack overflow
*/