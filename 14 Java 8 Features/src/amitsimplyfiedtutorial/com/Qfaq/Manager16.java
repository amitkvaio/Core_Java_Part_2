package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Given the list of numbers, remove the duplicate elements from the list.
public class Manager16 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 3, 2, 4, 2 };
		List<Integer> list = Arrays.asList(arr);
		List<Integer> out = list.stream().distinct().collect(Collectors.toList());
		System.out.println(out);
	}
}
