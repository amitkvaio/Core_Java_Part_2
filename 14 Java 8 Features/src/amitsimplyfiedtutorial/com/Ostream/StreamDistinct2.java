package amitsimplyfiedtutorial.com.Ostream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDistinct2 {
	public static void main(String[] args) {
		
		Employee lokesh = new Employee(1, "Lokesh", "Gupta");
		Employee brian = new Employee(2, "Brian", "Clooney");
		Employee alex = new Employee(3, "Alex", "Kolen");
         
        //Add some random persons
        Collection<Employee> list = Arrays.asList(lokesh,brian,alex,lokesh,brian,lokesh);
 
        // Get distinct only
        List<Employee> distinctElements = 
        			list.stream()
        			.filter(distinctByKey(p -> p.getId()))
        			.collect(Collectors.toList());
        
        // Let's verify distinct elements
        System.out.println(distinctElements);
	}
	
	public static <T> Predicate<T> distinctByKey(
			Function<? super T, Object> keyExtractor) {
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}

/*
Classes and apply filtering on class property.
java does not have any native API for filtering distinct by object property directly, 
	so we will create a utility function and then use it.
	
Above function uses a ConcurrentHashMap instance to find out if there is 
	any existing key with same value- where key is obtained from a function reference, 
	and here we will pass the object’s property getter method which will 
	cause the property value to act as the key to map.

*/