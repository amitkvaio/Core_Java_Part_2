package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders8 {
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
		
		memberNames.stream()
					.sorted()
					.map(member->member.toLowerCase())
					.forEach(member->System.out.println(member));
		
		System.out.println("*******");
		//OR
		memberNames.stream()
					.sorted()
					.map(String::toUpperCase)
					.forEach(System.out::println);
		
	}
}
/*
sorted()
Sorted is an intermediate operation which returns a sorted view of the stream. 
The elements are sorted in natural order unless you pass a custom Comparator.
*/
