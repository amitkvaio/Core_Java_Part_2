package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//To collect only even numbers from the array list  - with using stream.
public class C {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			list.add(i);
		}
		
		List<Integer> evenNumberList = list.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
		List<Integer> oddNumberList = list.stream().filter(i -> (i % 2 != 0)).collect(Collectors.toList());
		System.out.println("Even Number List : "+evenNumberList);
		System.out.println("Odd Number List : "+oddNumberList);
		list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		list.stream().sorted().filter(x->x%2==0).collect(Collectors.toList());
	}
}
/*

	Configuration: 
	we can configure either by using filter mechanism or by using map mechanism. 
	
	Filtering: 
	we can configure a filter to filter elements from the collection based on some boolean condition by 
	using filter()method of Stream interface. 
	 
	public Stream filter(Predicate<T> t)
	
	here (Predicate<T > t ) can be  a boolean valued function/lambda expression 
	Ex: 
	Stream s=c.stream(); 
	Stream s1=s.filter(i -> i%2==0); 
	 
	Hence to filter elements of collection based on some boolean condition  we should go for 
	filter()method. 

	processing by collect() method  
	This method collects the elements from the stream and adding to the specified to the collection 
	indicated (specified)by argument. 
*/