package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders7 {
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
							.map(mem->mem.toUpperCase())
							.forEach(pr->System.out.println(pr));
		System.out.println("***************************************");
		//OR
		memberNames.stream().filter(member->member.startsWith("A"))
							.map(String::toUpperCase)
							.forEach(System.out::println);
		
		
							
	}
}

/*
 stram().map()
The intermediate operation map converts each element into another object via the given function. 
The following example converts each string into an upper-cased string. 
But you can also use map to transform each object into another type.
*/