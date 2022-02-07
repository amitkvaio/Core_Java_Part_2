package amitsimplyfiedtutorial.com.Ostream;

import java.util.stream.Stream;

public class StreamReduce01 {
	public static void main(String[] args) {
		 
        Stream.of(10,20,22,12,14).reduce((x,y)->x+y).ifPresent(sum->System.out.println(sum));
        Stream.of(10,20,22,12,14).reduce(Integer::sum).ifPresent(System.out::println);
        
        Stream.of("java", "c", "c#", "python").reduce((x,y)->x+" | "+y).ifPresent(System.out::println);
    }
}
/*
Reduce ()
It is used to get the sum of numbers stored in List, Array etc. 

It can also concatenate the string stored in List and Array etc. 

Java 8 lambda Stream.reduce() method can perform many more reducing task as required. 

We are providing here some usability of Stream.reduce()

Stream.reduce() with Accumulator 
	
It performs a reduction on the elements of the given stream, using given accumulation function.

void java.util.Optional.ifPresent(Consumer<? super Integer> consumer)
	If a value is present, invoke the specified consumer with the value, otherwise do nothing.


*/
