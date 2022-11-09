import java.util.Arrays;
import java.util.Comparator;

public class FFindMaxAndMin {

	public static void main(String[] args) {
		int[] arr = { 10, 50, 3, 29, 60, 2 };
		Comparator<Integer> comp = (num1, num2) -> num1.compareTo(num2);
		Integer integer = Arrays.stream(arr).boxed().max(comp).get();
		System.out.println("Max::" + integer);
		Integer min = Arrays.stream(arr).boxed().min(comp).get();
		System.out.println("Min::" + min);
	}
}
