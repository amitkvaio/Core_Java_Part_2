package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.function.Predicate;

//Write a predicate to check whether the given integer is greater than 10 or not. 
//Using Predicate
public class C {
	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> n > 10;
		System.out.println(p.test(11));
		System.out.println(p.test(12));
	}
}
