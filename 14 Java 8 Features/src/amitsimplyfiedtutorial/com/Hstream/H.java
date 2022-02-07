package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//String sorting
public class H {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("amit");
		list.add("kumar");
		list.add("ajit");
		list.add("rakesh");
		list.add("niraj");
		list.add("devansh");
		System.out.println("Given String list is : "+list);
		
		List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("SortedList : "+sortedList);
	}
}
