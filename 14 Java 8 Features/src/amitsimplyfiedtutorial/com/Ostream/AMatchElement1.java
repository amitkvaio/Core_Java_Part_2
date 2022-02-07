package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AMatchElement1 {
	public static void main(String[] args) {
		Predicate<Integer> p = num -> num % 2 == 0;
		List<Integer> list = Arrays.asList(4, 6, 8,7);
		System.out.println("allMatch:" + list.stream().allMatch(p));
		System.out.println("anyMatch:" + list.stream().anyMatch(p));
		System.out.println("noneMatch:" + list.stream().noneMatch(p));
	}
}
/*
Stream.allMatch(), Stream.anyMatch() and Stream.noneMatch()

allMatch(): It returns true if all elements of stream matches the given Predicate. 
anyMatch(): It returns true if any element of stream matches the given Predicate. 
noneMatch(): It returns true if none of the elements of stream matches the given Predicate. 

*/