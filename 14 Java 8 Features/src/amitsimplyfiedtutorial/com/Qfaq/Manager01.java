package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

// How to check if list is empty in Java 8 using Optional, if not null iterate through the 
//list and print the object?
public class Manager01 {
	public static void main(String[] args) {
		List<String> notes = new ArrayList<>();
		List<String> not = new ArrayList<>();
		notes.add("note1");
		notes.add("note2");
		notes.add("note3");
		notes.add("note4");
		notes.add("note5");
		notes.add(null);
		
		Optional.ofNullable(notes)
		.orElseGet(Collections::emptyList)
		.stream()
		.filter(str->str!=null)
		.forEach(System.out::println);
		System.out.println("Main Finished");
	}
}
