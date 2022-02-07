package amitsimplyfiedtutorial.com.Blambda;
//@FunctionalInterface
public interface B {
	public void m1();
	
	

}

/*

In Java 8 ,SunMicroSystem introduced @FunctionalInterface annotation to 
specify that the interface is FunctionalInterface. 


Why the Default Method?
========================
Re-engineering an existing JDK framework is always very complex. 
Modifying one interface in a JDK framework breaks all classes that extend the interface, 
which means that adding any new method could break millions of lines of code. 
Therefore, default methods have introduced as a mechanism to 
	extend interfaces in a backward-compatible way.

Default methods can be provided to an interface without affecting implementing 
	classes as it includes an implementation. 
		If each added method in an interface is defined with implementation, 
		then no implementing class is affected. 
		An implementing class can override the default implementation provided by the interface.
*/