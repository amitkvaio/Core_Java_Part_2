package amitsimplyfiedtutorial.com.Hstream;
//Processing by count()method 
import java.util.ArrayList;

public class E {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("amit");
		list.add("kumar");
		list.add("ajit");
		list.add("rakesh");
		list.add("niraj");
		list.add("devansh");
		
		long count=list.stream().count();
		System.out.println("Total number of elements are in above list is : "+count);
	}
}

/*

Processing by count()method  
		- 	this method returns number of elements present in the stream.
		- 	long count=l.stream().filter(s ->s.length()==5).count()
				sop(“the number of 5 length strings is:”+count); 

*/