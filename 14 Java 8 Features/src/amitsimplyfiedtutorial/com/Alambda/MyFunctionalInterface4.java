package amitsimplyfiedtutorial.com.Alambda;
/*
An interface with only single abstract method is called functional interface 
(or Single Abstract method interface), for example: 
Runnable, callable, ActionListener etc.
*/

// Lambda Expression with multiple parameter

@FunctionalInterface
public interface MyFunctionalInterface4 {
	// A method with two parameter
	 public String sconcat(String a, String b);
}
