package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
//Reduce List and Array into Sum 
public class StreamReduce06 {
	public static void main(String[] args) {
		//Reduce Array to sum.
		int[] array = {30, 10, 20, 40};
		int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
		System.out.println("Sum of Array: "+ sum);
		
		//Reduce List to sum.
		List<Integer> list = Arrays.asList(30, 10, 20, 40);
		sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum of List: "+ sum);
	}
}
