package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.List;

public class StreamBuilders12 {
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
		
	
		boolean startWith=memberNames.stream()
					.anyMatch((s)->s.startsWith("A"));
		System.out.println("startWith->"+startWith);
		
		boolean endWith = memberNames.stream()
						.allMatch(mem->mem.startsWith("A"));
		System.out.println("endWith->"+endWith);
		
		boolean nonMatch = memberNames.stream()
							.noneMatch(mem->mem.startsWith("A"));
		
		System.out.println("noneMatch - > "+nonMatch);
	}
}
/*
C) match()
Various matching operations can be used to check whether a certain predicate matches the stream. 
All of those operations are terminal and return a boolean result.
*/