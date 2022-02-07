package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group by items name
public class B {
	public static void main(String[] args) {
		List<Item> itemList = Item.getListOfItems();
		
		 Map<String, Long> map =itemList.stream().
				 collect(Collectors.groupingBy(Item::getName ,Collectors.counting()));
		 System.out.println(map);
	}
}
