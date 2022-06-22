package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
// How to find only duplicate elements with its count from the String ArrayList in Java8?
public class Manager05 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> namesMap = names.stream()
				.filter(x -> Collections.frequency(names, x) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(namesMap);
	}
}
//https://www.techgeeknext.com/java/java8-programming-interview-questions-and-answers