package amitsimplyfiedtutorial.com.Goptional;

import java.util.Optional;

public class B {
	public static void main(String[] args) {
		Car car = new Car("50000");
		Optional<Car> opt = Optional.of(car); 
		System.out.println(opt.isPresent());
	}
}

/*
if you want to create an Optional with a non-null value then we can write as above code:

How this code is different from any code without Optional? 

Well, the biggest advantage of this code is that it will throw a 
NullPointerException immediately if Car car is null, rather than throwing a 
NullPointerException when you try to access any field of the person object.

Above code will return an Optional of Car object but value i.e. 
car must be not-null. 

In case the object is null then Optional.of() method will throw NullPointerException.

*/