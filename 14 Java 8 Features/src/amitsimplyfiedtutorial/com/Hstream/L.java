package amitsimplyfiedtutorial.com.Hstream;

import java.util.ArrayList;
import java.util.Arrays;

//VI.toArray() method 
public class L {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(0);
		list1.add(15);
		list1.add(10);
		list1.add(5);
		list1.add(30);
		list1.add(25);
		list1.add(20);
		System.out.println("List1 elements are : "+list1);
		
		Integer[] arr = list1.stream().toArray(Integer[] :: new);
		System.out.println(Arrays.toString(arr));
	}
}

/*

VI.toArray() method 
we can use toArray() method to copy elements present in the stream into specified array

*/
