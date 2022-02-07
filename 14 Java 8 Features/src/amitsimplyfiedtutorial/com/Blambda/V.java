package amitsimplyfiedtutorial.com.Blambda;

public class V {
	public static void main(String[] args) {
		new Cc()  {
			
			@Override
			public void test5() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}

abstract class Aa{
	abstract void test1();
	public void test2() {
		System.out.println("**** From test2 *****");
	}
}

class Bb{
	public void test3() {
		System.out.println("***** from test3 ****");
	}
	
	public void test4() {
		System.out.println("******** from test4 *******");
	}
}

interface Cc{
	public void test5();
}