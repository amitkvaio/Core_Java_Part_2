package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

public class H {
	public static void main(String[] args) {
		Function<Integer, Integer> id = Function.identity();
		System.out.println(id.apply(3));
	}
}

/*

Function.indentity()
--------------------

Function identity returns a function that always returns its input argument.

identity has the following syntax.
static <T> Function<T,T> identity()


*/