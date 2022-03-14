package amitsimplyfiedtutorial.com.Qfaq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//What is the best way to convert a primitive Array to a List in Java 8?
public class Manager08 {
	public static void main(String[] args) {
		// Before java 8
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> numLst = new ArrayList<>();
		for (int n : nums) {
			numLst.add(n);
		}
		System.out.println(Arrays.toString(nums));

		System.out.println("<<<<<<<<<<<<<<<<<<<<<");
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		list.forEach(System.out::println);
		// or
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		List<Integer> lst = IntStream.of(nums).boxed().collect(Collectors.toList());
		lst.forEach(System.out::println);
	}
}
