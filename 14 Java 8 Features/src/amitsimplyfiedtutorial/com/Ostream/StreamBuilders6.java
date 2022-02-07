package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders6 {
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
		
		memberNames.stream().filter(member->member.startsWith("A"))
				.forEach(mem->System.out.println(mem));
		System.out.println("*******************");
		memberNames.stream().filter(member->member.endsWith("h"))
				.forEach(System.out::println);
		
	} 
}
/*
 filter()

Filter accepts a predicate to filter all elements of the stream. 
This operation is intermediate which enables us to call another stream operation (e.g. forEach) on the result.
*/
