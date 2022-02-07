package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.function.Predicate;

public class I {
	public static void main(String[] args) {
		Predicate<Integer> greaterThan = (p)-> p > 50 ;
		Predicate<Integer> lessThan = (p) -> p < 100 ; 
		
		boolean sts1 = greaterThan.and(lessThan).test(75);
		boolean sts2 = greaterThan.and(lessThan).test(105);
		
		System.out.println("sts1->"+sts1);
		System.out.println("sts2->"+sts2);
		System.out.println("Done");
	}
}
