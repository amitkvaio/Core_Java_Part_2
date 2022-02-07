package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class K {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(15);
		list1.add(10);
		list1.add(5);
		list1.add(30);
		list1.add(25);
		list1.add(20);
		System.out.println("Given Array List : " + list1);

		List<Integer> list2 = list1.stream().map(i -> i + 10).collect(Collectors.toList());
		System.out.println("Modified Array List:" + list2);
		
		 long count = list1.stream().filter(i->i%2==0).count();   
		 System.out.println(count + " Number are in list1 which are divisible by 2");  
		 
		 List<Integer> list3=list1.stream().sorted().collect(Collectors.toList());   
		 System.out.println("list1 is in natural sorting order : " + list3);
		 
		Comparator<Integer> comp=(i1,i2)->-i1.compareTo(i2);   
		List<Integer> list4=list1.stream().sorted(comp).collect(Collectors.toList());   
		System.out.println("Customized sorting order : " + list4);
		
		Integer min=list1.stream().min(comp).get();   
		System.out.println("Minimum value in list1 is : "+min);   
		Integer max=list1.stream().max(comp).get();   
		System.out.println("Maximum value in list1 is : "+max);  
		
		System.out.println("Printing by using for Each loop");
		list3.stream().forEach(i->System.out.println(i));   
		System.out.println("==========");
		list3.stream().forEach(System.out:: println);   
	}
}
