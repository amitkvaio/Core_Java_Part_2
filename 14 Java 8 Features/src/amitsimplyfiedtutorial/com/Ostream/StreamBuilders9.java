package amitsimplyfiedtutorial.com.Ostream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Printing in reverse order
public class StreamBuilders9 {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Comparator<String> comparator = (str1,str2)->str1.compareTo(str2);
		memberNames.sort(comparator.reversed());
		
		memberNames.stream()
					.map(member->member.toUpperCase())
					.forEach(mem->System.out.println(mem));
		
	}
}
