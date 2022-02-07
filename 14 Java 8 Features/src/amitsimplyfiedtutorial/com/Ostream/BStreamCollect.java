package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BStreamCollect {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,6,10);
		int sum=list.stream().collect(Collectors.summingInt(s->s));
		System.out.println("Sum: "+ sum);
		
	}
}


/*
Stream.collect()
It performs mutable reduction operation with java 8 Collector. 
Find the example to sum the integers in a list. 
*/