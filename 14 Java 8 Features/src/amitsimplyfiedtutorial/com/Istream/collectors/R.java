package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// remove the duplicate elements from the list.
public class R {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> listWithDuplicates = Arrays.asList(arr);
		System.out.println("Given Student list are>>");
		listWithDuplicates.forEach(System.out::println);
		System.out.println("************************************************");
		listWithDuplicates.stream()
			.collect(Collectors.toSet()).forEach(dup -> System.out.println(dup));
	}
}
