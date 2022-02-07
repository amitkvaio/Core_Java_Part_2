package amitsimplyfiedtutorial.com.Hstream;
//Processing by count()method
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class F {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("amit");
		list.add("kumar");
		list.add("ajit");
		list.add("rakesh");
		list.add("niraj");
		list.add("devansh");
		
		List<String> nameList=list.stream().filter(s->s.length()==5).collect(Collectors.toList());
		System.out.println("Name of list which haivng the length is 5 : "+nameList);
	}
}
