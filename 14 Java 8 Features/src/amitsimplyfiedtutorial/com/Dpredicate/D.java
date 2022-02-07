package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.function.Predicate;

//Write a predicate to check the length of given string is greater than 3 or not. 
public class D {
	public static void main(String[] args) {
		Predicate<String> p = (s) -> s.length() > 3;
		System.out.println(p.test("amit"));
		System.out.println(p.test("kumar"));
		System.out.println(p.test("ab"));
	}
}
