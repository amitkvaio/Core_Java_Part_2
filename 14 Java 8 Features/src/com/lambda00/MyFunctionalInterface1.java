package com.lambda00;
/*
An interface with only single abstract method is called functional interface 
(or Single Abstract method interface), for example: 
Runnable, callable, ActionListener etc.
*/

// Lambda Expression with no parameter

@FunctionalInterface
public interface MyFunctionalInterface1 {
	//A method with no parameter fun
   public String sayHello();
}
