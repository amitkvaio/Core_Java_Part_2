package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.function.Predicate;

public class F {
	public static void main(String[] args) {
		 int[] x = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p1 = i -> (i > 10);
		Predicate<Integer> p2 = I -> (I % 2 == 0);
		 F f = new F();
		System.out.println("Greater than 10");
		f.m1(x, p1);
		
		System.out.println("Even Number");
		f.m1(x, p2);
		System.out.println("Greater than 10 and Even number");
		f.m1(x,p1.and(p2));
		System.out.println("Number greater than 10 or Even number");
		f.m1(x, p1.or(p2));
		System.out.println("Number not greater than 10");
		f.m1(x, p1.negate());
	}
	
	public void m1(int[] x , Predicate<Integer> pr) {
		for (int i = 0; i < x.length; i++) {
			if(pr.test(x[i])) {
				System.out.println (x[i] + " ");
			}
		}
	}
}

/*

Predicate joining 
It’s possible to join predicates into a single predicate by using the following methods. 
  and() 
  or() 
  negate() 
these are exactly same as logical AND ,OR complement operators 

*/