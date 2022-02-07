package amitsimplyfiedtutorial.com.Alambda;
/*
An interface with only single abstract method is called functional interface 
(or Single Abstract method interface), for example: 
Runnable, callable, ActionListener etc.
*/

// Lambda Expression with  parameter

@FunctionalInterface
public interface MyFunctionalInterface3 {
	// A method with single parameter
	  public int incrementByFive(int a);
}
