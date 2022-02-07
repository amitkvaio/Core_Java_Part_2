package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;
//Function which takes in a number and returns half of it
public class C {
	public static void main(String args[]) {

		Function<Integer, Double> half = a -> a / 2.0;
		// apply the function to get the result
		System.out.println(half.apply(10));
	}
}
