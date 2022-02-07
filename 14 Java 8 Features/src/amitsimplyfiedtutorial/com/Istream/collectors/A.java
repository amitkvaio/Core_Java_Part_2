//Java 8 Collectors: joining() Example
package amitsimplyfiedtutorial.com.Istream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	public static void main(String[] args) {
		String[] nameList = {"Ram","Shyam","Shiv","Mahesh"};
		List<String> list = Arrays.asList(nameList);
		String result=  list.stream().collect(Collectors.joining());
		System.out.println("Result:"+result);
	}
}

/*

joining() method returns Collector instance. It concatenates the input elements in encounter order. 
We can pass delimiter, prefix and suffix too in element concatenation.

output :
Result:RamShyamShivMahesh
*/