package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.List;

//What are different ways of iterating collection list in Java 8?
public class Manager00 {
	public static void main(String[] args) {
		List<String> notes = new ArrayList<>();
		notes.add("note1");
		notes.add("note2");
		notes.add("note3");
		notes.add("note4");
		notes.add("note5");
		
		//Using lambda expression
		notes.forEach(note->System.out.println(note));
		System.out.println("===========1================");
		
		//Output : note3
		notes.forEach(note->{
			if("note3".equals(note)){
				System.out.println(note);
			}
		});
		System.out.println("============2=================");
		//using stream
		notes.stream().forEach(note->System.out.println(note));
		System.out.println("===========3================");
		
		//Using Stream and filter
		notes.stream().filter(note -> !"note3".equals(note)).forEach(note -> System.out.println(note));

		System.out.println("===========4================");
		//Using method reference
		notes.forEach(System.out::println);
		
	}
}
