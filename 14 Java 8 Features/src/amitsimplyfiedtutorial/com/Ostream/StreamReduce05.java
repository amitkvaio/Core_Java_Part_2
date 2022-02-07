package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

//Reduce List and Array into a String
public class StreamReduce05 {
	public static void main(String[] args) {
		//Reduce Array to String.
		String[] array = {"Mohan", "Sohan", "Mahesh"};
		
		Arrays.stream(array)
				.reduce((x,y)->x + ","+y)
				.ifPresent(x->System.out.println("Array to String: "+x));
		
		//Reduce List to String.
		List<String> list = Arrays.asList("Mohan", "Sohan", "Mahesh");
		list.stream().reduce((x, y) -> x +"," + y)
			       .ifPresent(s -> System.out.println("List to String: "+ s));
	}
}
