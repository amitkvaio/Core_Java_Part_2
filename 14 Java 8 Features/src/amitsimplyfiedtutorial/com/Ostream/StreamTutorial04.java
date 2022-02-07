// Merge all the non empty string by adding "-"
package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTutorial04 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "", "mno");
		
		String listWithout=strList.stream().filter((str)-> ! str.isEmpty()).collect(Collectors.joining());
		String strDelimeter = strList.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining("-"));
		String str1 = strList.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining("-", "<", ">"));
		
		System.out.println("listWithout : "+listWithout);
		System.out.println("strDelimeter : "+strDelimeter);
		System.out.println("Str1 : "+str1);
	}
}

/*
Output

listWithout : abcbcefgabcdjklmno
strDelimeter : abc-bc-efg-abcd-jkl-mno
Str1 : <abc-bc-efg-abcd-jkl-mno>

*/



