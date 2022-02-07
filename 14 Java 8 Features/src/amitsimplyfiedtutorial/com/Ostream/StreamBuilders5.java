package amitsimplyfiedtutorial.com.Ostream;
import java.util.stream.Stream;

public class StreamBuilders5 {
	 
	 public static void main(String[] args){
	       /* IntStream stream = "12345_Abcdefg".chars();
	        stream.forEach(p -> System.out.println(p));*/
	         
	        //OR
	         
	        Stream<String> stream = Stream.of("A$https://howtodoinjava.com/category/java-8/B$C".split("\\$"));
	        stream.forEach(p -> System.out.println(p));
	     }
}
/*

*/
