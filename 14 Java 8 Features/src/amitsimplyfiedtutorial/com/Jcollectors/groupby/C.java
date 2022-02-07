package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// group by quantity
public class C {
	public static void main(String[] args) {
		List<Item> itemList = Item.getListOfItems();
		
		Map<BigDecimal, List<Item>> map =itemList.stream().collect(Collectors.groupingBy(Item::getPrice));
		System.out.println(map);
	}
}

/*
{
	19.99=[Item [name=banana, qty=20, price=19.99], Item [name=banana, qty=10, price=19.99]], 
	29.99=[Item [name=orang, qty=10, price=29.99], Item [name=watermelon, qty=10, price=29.99]], 
	9.99=[Item [name=apple, qty=10, price=9.99], Item [name=papaya, qty=20, price=9.99], 
				Item [name=apple, qty=10, price=9.99], Item [name=apple, qty=20, price=9.99]]
	
}
*/
