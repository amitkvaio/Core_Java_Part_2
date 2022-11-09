//filter out the a and print out all the characters.
package amitsimplyfiedtutorial.com.Qimp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CfmFilter {
	public static void main(String[] args) {
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		  // array to a stream
		  Stream<String[]> stream1 = Arrays.stream(array);

		  // x is a String[]
		  List<String[]> result = stream1
		          .filter(x -> {
		              for(String s : x){      // really?
		                  if(s.equals("a")){
		                      return false;
		                  }
		              }
		              return true;
		          }).collect(Collectors.toList());

		  // print array
		  result.forEach(x -> System.out.println(Arrays.toString(x)));
	}
}
