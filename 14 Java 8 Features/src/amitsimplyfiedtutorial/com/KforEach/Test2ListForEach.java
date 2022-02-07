package amitsimplyfiedtutorial.com.KforEach;

import java.util.ArrayList;
import java.util.List;

public class Test2ListForEach {
	public static void main(String[] args) {
		List<String> letterList = new ArrayList<>();
		letterList.add("A");
		letterList.add("B");
		letterList.add("C");
		letterList.add("D");
		letterList.add("E");
		
		//GENRAL WAY TO PRINT LIST OBJECT
		for (String item : letterList) {
			System.out.println("Items->"+item);
		}
		//using java 8 
		
		System.out.println("Using java 8");
		letterList.forEach((item)->System.out.println("Items->"+item));
		
		//using java 8 printing only C values
		
		System.out.println("Filtering the Item C");
		letterList.forEach((item)->{
			if(!"C".equals(item)){
				System.out.println("Letter ::"+item);
			}
		});
		
		//Stream and filter
		//Output : B
		System.out.println("Filtering the letter C");
		letterList.stream()
			.filter(s->!s.contains("C"))
			.forEach(System.out::println);
	}
}
