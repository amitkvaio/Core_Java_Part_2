package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;

public class StreamTutorial02 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "", "mno");
		//count the total number of String whose length is equal to 3 using java 7 
		
		int count = 0;
		for (String string : strList) {
			if(string.length() == 3) {
				count++;
			}
		}
		System.out.println("Total number of string  : "+count);
		
		//Using java 8
		long countJava8 = strList.stream().filter((str)->str.length()==3).count();
		System.out.println("Using java 8 : "+countJava8);
		
	}
}
