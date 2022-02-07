package amitsimplyfiedtutorial.com.MmapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MapExample {
	public static void main(String[] str) {
		List<String> listOfCountries = Arrays.asList("India", "China", "Nepal", "Bhutan");

		List<String> listOfCountriesUppercase = listOfCountries.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
		listOfCountriesUppercase.forEach(System.out::println);
	}
}
