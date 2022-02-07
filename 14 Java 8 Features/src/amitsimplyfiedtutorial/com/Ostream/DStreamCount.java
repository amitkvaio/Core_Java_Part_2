package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DStreamCount {
	public static void main(String[] args) {
		Predicate<Integer> p = num -> num % 2 == 0;
		List<Integer> list = Arrays.asList(0,4,6,8,9,10,12,14);
		System.out.println("Count: " + list.stream().filter(p).count());
	}
}
/*
Stream.count()
It returns the number of elements in stream based on the given condition.
*/