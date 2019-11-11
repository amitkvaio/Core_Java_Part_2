//In Java 8, you can either use Arrays.stream or Stream.of to convert an Array into a Stream.
//Note For object arrays, the Stream.of method is calling the Arrays.stream internally. 

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test01Array2Steam {
	public static void main(String[] args) {
		 String[] array = {"a", "b", "c", "d", "e","f","g","h"};
		 Stream<String> stream = Arrays.stream(array);
		 stream.forEach((st)->System.out.println(st));
		 System.out.println("##### Done ########");
		 
		 System.out.println("##### Using Stream.of() ########");
		 Stream<String> stream2 = Stream.of(array);
		 stream2.forEach((st)->System.out.println(st));	
	}
}
