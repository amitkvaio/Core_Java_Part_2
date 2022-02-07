package amitsimplyfiedtutorial.com.MmapandFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FlatMapExample {
	public static void main(String[] str)
	{
		List<List<String>> listofListOfCities=
				Arrays.asList(Arrays.asList("Delhi","Mumbai"),
				Arrays.asList("Beijing","Shanghai","Tianjin"),
				Arrays.asList("Kathmandu","Lalitpur"),
				Arrays.asList("Thimphu","Phuntsholing"));
		
		List<String> listOfCitiesUppercase=listofListOfCities.stream()
				           .flatMap(citiesByCountries -> citiesByCountries.stream())
				           .filter(s -> s.startsWith("T"))
				           .collect(Collectors.toList());
		listOfCitiesUppercase.forEach(System.out::println);
	}
}
/*

As we might know, Stream’s map and flatMap method both can be 
	applied on Stream<T> and return Stream<R> as output.

The actual difference is, map operation produces one output value for one input 
	value but flatMap operation produces zero or more number of values for each input value.


*/