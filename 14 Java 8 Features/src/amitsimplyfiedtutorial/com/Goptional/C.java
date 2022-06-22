package amitsimplyfiedtutorial.com.Goptional;

import java.util.Optional;

public class C {
	public static void main(String[] args) {
		Car c1 = new Car("50000");
		Car c2 = null;
		Optional<Car> opt1 = Optional.ofNullable(c1);
		System.out.println(opt1);
		
		Optional<Car> opt2 = Optional.ofNullable(c2);
		System.out.println(opt2);
		System.out.println(opt2.isPresent());
	}
}

/*

Third and probably the most useful way of creating an Optional 
instance is by using the ofNullable() method of java.util.Optional class 
which allows you to create an Optional object that may hold a null 
value as above example:

In case the Car object is null, the resulting Optional object would be empty, 
but it won't throw the NullPointerException.

https://javarevisited.blogspot.com/2017/04/10-examples-of-optional-in-java-8.html
*/