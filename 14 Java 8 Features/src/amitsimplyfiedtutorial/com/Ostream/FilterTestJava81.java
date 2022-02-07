package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterTestJava81 {
	public static void main(String[] args) {

		String[] arrayString = { "spring", "Java", "GWT" };

		List<String> subjectList = Arrays.asList(arrayString);

		// Filtering out spring
		Stream<String> reStream = subjectList.stream() // convert list to stream
				.filter(subject -> !subject.equals("spring")); // Filtering out
																// spring
		
		List<String> listSubject = reStream.collect(Collectors.toList());
		// collect the output and convert streams to a List
		
		listSubject.forEach(subject -> System.out.println(subject));

	}

}
