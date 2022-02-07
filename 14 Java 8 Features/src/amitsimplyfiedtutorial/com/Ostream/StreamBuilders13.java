package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders13 {
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
		
	
		long count=memberNames.stream()
					.filter(mem->mem.startsWith("A"))
					.count();
		System.out.println("Count::"+count);
		 
	}
}
/*

D) count()
Count is a terminal operation returning the number of elements in the stream as a long.

*/