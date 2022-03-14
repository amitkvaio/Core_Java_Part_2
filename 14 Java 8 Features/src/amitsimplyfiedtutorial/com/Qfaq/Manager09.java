package amitsimplyfiedtutorial.com.Qfaq;

import java.util.Arrays;
import java.util.Collections;

//How to sort int arrays of primitive types in descending order in Java 8?
public class Manager09 {
	public static void main(String[] args) {
		int[] numArr = new int[] { 1, 2, 3, 4, 5 };

		int[] sortedNumArr = Arrays.stream(numArr).boxed().sorted(Collections.reverseOrder())
				.mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(sortedNumArr));
	}
}
