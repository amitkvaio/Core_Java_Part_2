import java.util.function.Function;
import java.util.stream.Collectors;

/*
Frequency of each character, VVI
*/
public class AFrequencyOf {
	public static void main(String[] args) {
		String str = "amit kumar";
		str.chars()
		.mapToObj(ch ->(char)ch)
		.filter(ch-> ch!= ' ')
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.forEach((k,v)->System.out.println(k + " :" + v));
	}
}
