//Group by a List and display the total count of it.
package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		//3 apple, 2 banana, others 1
		List<String> fruitsList = 
				Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		Map<String, Long> map = fruitsList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}

/*

{papaya=1, orange=1, banana=2, apple=3}

*/
