package amitsimplyfiedtutorial.com.Dpredicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

//write a predicate to check whether the given collection is empty or not. 
public class E {
	public static void main(String[] args) {
		Predicate<Collection> p = (c) -> c.isEmpty();
		List<String> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		set.add(12);
		System.out.println(p.test(list));
		System.out.println(p.test(set));
	}
}


// till page no -22/37