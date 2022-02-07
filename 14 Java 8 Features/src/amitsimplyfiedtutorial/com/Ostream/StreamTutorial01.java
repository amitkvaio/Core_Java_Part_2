package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

public class StreamTutorial01 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "");
		//count the total number of empty string using java 7
		int count = 0;
		for (String string : strList) {
			if(string.isEmpty()) {
				count++;
			}
		}
		System.out.println("Total number of empty strings using java 7 are : "+count);
		
		//Using java 8
		long countJava8 = strList.stream().filter((str)->str.isEmpty()).count();
		System.out.println("Using java 8 : "+countJava8);
		
		//using parallel stream method
		long totalCount = strList.parallelStream().filter(str -> str.isEmpty()).count();
		System.out.println("Total Count :"+totalCount);
		
	}
}
