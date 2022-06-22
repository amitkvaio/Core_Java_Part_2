package amitsimplyfiedtutorial.com.Efunction;

import java.util.function.Function;

public class F {
	public static void main(String[] args) {
		Function<Integer, Integer> caller = e -> e * 2;
		Function<Integer, Integer> squared = e -> e * e;

		int andThen=caller.andThen(squared).apply(4);  
		System.out.println("Result with andThen: " + andThen);
		
		int compose = caller.compose(squared).apply(4); 
		System.out.println("Result with compose: " + compose);
	}
}
/*

We can see, the difference between compose and andThen is the order they execute the functions.

compose function executes the caller last and the parameter first
for compose parameter first = squared and caller last = times2


andThen executes the caller first and the parameter last.
for andThen caller first = times2  and parameter last = squared

Result with andThen: 64
Result with compose: 32

While a.andThen(b) is equivalent to b.compose(a)
*/