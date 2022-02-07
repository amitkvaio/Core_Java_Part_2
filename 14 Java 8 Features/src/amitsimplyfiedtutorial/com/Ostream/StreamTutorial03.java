package amitsimplyfiedtutorial.com.Ostream;
//Filter the non - empty string
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTutorial03 {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "", "mno");
		
		List<String> nonEmptyList = strList.stream().filter((str) -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println("NonEmptyList:" + nonEmptyList);
	}
}
