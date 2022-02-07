//How to create Optional Object in Java 8
package amitsimplyfiedtutorial.com.Goptional;

import java.util.Optional;

public class A {
	public static void main(String[] args) {
		 
		Optional<Car> opt = Optional.empty();
		System.out.println(opt.empty());
	}
}
/*
There are many ways to create an object of the Optional class in Java.
We can create an empty Optional by using the static method Optional.empty() as shown above:
This Optional is empty,
*/
