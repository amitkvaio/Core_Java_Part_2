package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBuilders11 {
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
		
		List<String> memberList=memberNames.stream()
				.map(mem->mem.toUpperCase())
				.collect(Collectors.toList());
		
		memberList.forEach(member->System.out.println(member));
		
	}
}
/*
	B) Collect ()

	Collect () method used to receive elements from a stream and store them in a 
	collection and motioned in parameter function.

*/
