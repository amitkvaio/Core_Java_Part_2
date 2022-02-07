package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders10 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		memberNames.forEach(System.out::println);
		System.out.println("******OR*******");
		memberNames.forEach(member->System.out.println(member));
	}
}

/*
Terminal operations
Terminal operations return a result of a certain type instead of again a Stream.

A) forEach()
This method helps in iterating over all elements of a 
	stream and perform some operation on each of them. 
	The operation is passed as lambda expression parameter.
*/
