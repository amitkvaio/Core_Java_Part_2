package amitsimplyfiedtutorial.com.Ostream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeekEx {
	public static void main(String a[]) {
		Stream.of("bus", "car", "bycle", "flight", "train")
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.collect(Collectors.toList());
	}
}
/*

The Stream.peek() method is mainly to support debugging, where you want to see the elements 
	as they flow past a certain point in a pipeline.
The Stream.peek() method returns a stream consisting of the elements of this stream, 
	additionally performing the provided action on each element as elements are consumed from the resulting stream.



*/
