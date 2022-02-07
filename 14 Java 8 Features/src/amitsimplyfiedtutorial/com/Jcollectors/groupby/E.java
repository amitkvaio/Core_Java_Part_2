package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Counting by string length
public class E {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("a", "bb", "cc", "ddd");
		Map<Integer, List<String>> map=strList.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
}
/*
{1=[a], 2=[bb, cc], 3=[ddd]}
*/



