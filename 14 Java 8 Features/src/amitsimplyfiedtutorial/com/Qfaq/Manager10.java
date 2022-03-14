package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How to concatenate List of String/Integer Objects using some separator in Java8?

public class Manager10 {
	public static void main(String[] args) {
		// input
		List<String> str = Arrays.asList("Welcome", "to", "TechGeekNext");

		String jonStr = str.stream().map(String::valueOf).collect(Collectors.joining(" - "));
		// output
		System.out.println(jonStr);	
	}
}
