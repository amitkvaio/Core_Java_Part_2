//joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {
	public static void main(String[] args) {
		String[] nameList = {"Ram","Shyam","Shiv","Mahesh"};
		List<String> list = Arrays.asList(nameList);
		String result=list.stream().collect(Collectors.joining("|", "[", "]"));
		System.out.println("Result : "+result);
	}
}
/*
output:
Result : [Ram|Shyam|Shiv|Mahesh]
*/
