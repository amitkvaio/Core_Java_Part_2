import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KFindMostRepeatedNumber {
	public static void main(String[] args) {
		String str1 = "This is string is This is a string";

		String[] str = str1.split("\\s");

		Map<String, Long> map = Arrays.stream(str)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		long num = 0L;
		String desiredKey = "";
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (map.get(key) > num) {
				num = map.get(key);
				desiredKey = key;
			}
			// System.out.println(key +"-->"+map.get(key));
		}
		System.out.println("Most Repeated Word in the given string is : " + desiredKey + "\nHaving count of " + num);
	}
}
