import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Even Max
arr= {2,5,38,90,45,100}
*/
public class I {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 38, 90, 45, 100 };
		evenMax1(arr);
		evenMax2(arr);
	}

	private static void evenMax2(int[] arr) {
		int evenMax = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				if(arr[i]>evenMax) {
					evenMax = arr[i];
				}
			}
		}
		System.out.println("EvenMax::"+evenMax);
	}

	private static void evenMax1(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().toList();

		Comparator<Integer> comp = (first, second) -> first.compareTo(second);

		Integer evenMax = list.stream().filter(x -> x % 2 == 0).max(comp).get();
		System.out.println("EvenMax::" + evenMax);
	}
}
