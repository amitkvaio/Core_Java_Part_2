package amitsimplyfiedtutorial.com.Ostream;
// Distinct square list
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTutorial05 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 10, 2, 13, 14, 15, 16, 17, 2, 10);
		List<Integer> mapList=intList.stream().map((num)-> num *num).distinct().collect(Collectors.toList());
		System.out.println("MapList : "+mapList);
	}
}
