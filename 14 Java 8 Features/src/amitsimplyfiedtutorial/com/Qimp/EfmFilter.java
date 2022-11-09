package amitsimplyfiedtutorial.com.Qimp;

import java.util.Arrays;
import java.util.stream.Stream;

public class EfmFilter {
	public static void main(String[] args) {
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		  // Java 8
		  String[] result = Stream.of(array)  // Stream<String[]>
		          .flatMap(x->Arrays.stream(x))        // Stream<String>
		          .toArray(String[]::new);    // [a, b, c, d, e, f]

		  for (String s : result) {
		      System.out.println(s);
		  }
	}
}
