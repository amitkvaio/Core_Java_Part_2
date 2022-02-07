package amitsimplyfiedtutorial.com.Alambda;

import java.util.ArrayList;
import java.util.List;

// Iterating collections using foreach loop
public class IterationForEachLoop1 {
	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  
	       list.add("AMIT");         
	       list.add("KUMAR");       
	       list.add("AJIT");         
	       list.add("PRAJAPATI");         
	       list.add("NAGAR");
	       
	       list.forEach((personName)->System.out.println(personName));
	       
	}
}	
