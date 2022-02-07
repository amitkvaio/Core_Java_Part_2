package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Grouping and Counting Items in Groups
public class F {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("a", "bb", "cc", "ddd");
		Map<Integer, Long> map =strList.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
		System.out.println(map);
	}
}

/*
{1=1, 2=2, 3=1}
*/