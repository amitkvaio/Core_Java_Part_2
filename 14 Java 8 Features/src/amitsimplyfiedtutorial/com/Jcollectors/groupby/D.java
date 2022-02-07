////Group by + Count
package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class D {
	public static void main(String[] args) {
		List<Item> itemList = Item.getListOfItems();
		 Map<String, Integer> map=
		itemList.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
		 System.out.println(map);
	}
}
/*
output
{papaya=20, orange=10, banana=30, apple=40, watermelon=10}

*/