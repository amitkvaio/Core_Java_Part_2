package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// sorting in natural order
public class G {
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(5);
		 list.add(25);
		 list.add(9);
		 list.add(4);
		 list.add(15);
		 System.out.println("Given List without sorting : "+list);
		 
		 List<Integer> sortedList= list.stream().sorted().collect(Collectors.toList());
		 System.out.println("SortedList : "+sortedList);
	}
}


/*

--	III.Processing by sorted()method 
--	if we sort the elements present inside stream then we should go for sorted() method.
--	The sorting can either default natural sorting order or customized sorting order specified by 

--	comparator. 
	-----------
		sorted()- default natural sorting order 
		sorted(Comparator c)-customized sorting order. 
 
		Ex: 
		List<String> l3=l.stream().sorted().collect(Collectors.toList()); 
		sop(“according to default natural sorting order:”+l3); 
		 
		List<String> l4=l.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList()); 
		sop(“according to customized sorting order:”+l4); 

*/