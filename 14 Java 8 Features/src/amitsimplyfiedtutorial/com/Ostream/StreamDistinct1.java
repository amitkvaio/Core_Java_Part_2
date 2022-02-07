package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct1 {
	public static void main(String[] args) {
		String [] strArray = {"A","B","C","D","A","C","E","A","D","F"};
		List<String> list=Arrays.asList(strArray);
		list.stream()
			.distinct()
			.collect(Collectors.toList())
			.forEach(ch->System.out.println(ch));
	}
}
/*
we will find all distinct strings, 
	collect them into another list and then verify it.
*/
