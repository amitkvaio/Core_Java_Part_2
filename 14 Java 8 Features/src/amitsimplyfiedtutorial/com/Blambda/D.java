package amitsimplyfiedtutorial.com.Blambda;
@FunctionalInterface
public interface D {
	public void test1();
}
/*
--	Inside FunctionalInterface we have to take exactly only one abstract method.
--	If we are not declaring any method then compiler gives an error message. 
--	Comments the test1() method.

Is it mandatory to mark a functional interface with @FunctionalInterface annotation in Java?
********************************************************************************************
An interface defined with only one abstract method is known as Functional Interface. 

-It's not mandatory to mark the functional interface with @FunctionalInterface annotation, 
-the compiler doesn't throw any error. 

But it’s good practice to use @FunctionalInterface annotation to avoid the addition of extra methods accidentally. 

If an interface annotated with @FunctionalInterface annotation and more than one abstract 
method then it throws a compile-time error.

*/