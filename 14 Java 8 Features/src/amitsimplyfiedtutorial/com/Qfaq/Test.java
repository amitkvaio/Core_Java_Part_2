package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	private static int[] array;

	public static void main(String[] args) {
		List<Integer> names = Arrays.asList(10,20,30,40,10,20,30,30,60,70,10,30);
		Map<Integer, Long> collect = names.stream()
				.filter(str->Collections.frequency(names, str)>1)
				.sorted()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		int[] numArr = new int[] { 1, 2, 3, 4, 5 };
		
		array = Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
		.mapToInt(x->Integer.valueOf(x)).toArray();
		System.out.println(Arrays.toString(array));
	}
}
