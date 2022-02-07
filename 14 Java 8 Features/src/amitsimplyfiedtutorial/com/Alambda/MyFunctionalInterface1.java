package amitsimplyfiedtutorial.com.Alambda;
/*
An interface with only single abstract method is called functional interface 
(or Single Abstract method interface), for example: 
Runnable, callable, ActionListener etc.
*/

// Lambda Expression with no parameter

@FunctionalInterface
public interface MyFunctionalInterface1 {
	// A method with no parameter fun
	public String sayHello();
}

class Ab implements MyFunctionalInterface1 {
	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hi";
	}

	public static void main(String[] args) {
		MyFunctionalInterface1 a = new Ab();
		System.out.println(a.sayHello());
	}
}