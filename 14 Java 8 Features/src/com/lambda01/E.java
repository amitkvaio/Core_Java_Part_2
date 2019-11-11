package com.lambda01;
@FunctionalInterface
public interface E {
	public abstract void method1();
}

//@FunctionalInterface
interface F extends E{
	
}




/*

--	FunctionalInterface with respect to Inheritance: 
--	If an interface extends FunctionalInterface and child interface doesn’t 
--	contain any abstract method then child interface is also FunctionalInterface 

*/