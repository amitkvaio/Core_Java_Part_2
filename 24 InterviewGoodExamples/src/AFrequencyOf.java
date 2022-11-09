import java.util.Map;
import java.util.stream.Collectors;

/*
Frequency of each character, VVI
*/
public class AFrequencyOf {
	public static void main(String[] args) {
		String str = "amit kumar";
		Map<Character, Integer> frequency = str.chars().boxed().filter(x->x!=' ')
				.collect(Collectors.toMap(k -> 
				Character.valueOf((char) k.intValue()), v -> 1, Integer::sum));
		System.out.println(frequency);
		System.out.println("Done");
	}
}
