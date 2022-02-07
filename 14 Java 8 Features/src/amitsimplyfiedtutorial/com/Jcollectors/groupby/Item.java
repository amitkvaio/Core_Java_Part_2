package amitsimplyfiedtutorial.com.Jcollectors.groupby;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Item {
	private String name;
	private int qty;
	private BigDecimal price;
	
	public Item(String name,int qty,BigDecimal price) {
		this.name=name;
		this.qty=qty;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	 
	public int getQty() {
		return qty;
	}
	 
	public BigDecimal getPrice() {
		return price;
	}
	 
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	public static List<Item> getListOfItems(){
		 List<Item> items = Arrays.asList(
	                new Item("apple", 10, new BigDecimal("9.99")),
	                new Item("banana", 20, new BigDecimal("19.99")),
	                new Item("orange", 10, new BigDecimal("29.99")),
	                new Item("watermelon", 10, new BigDecimal("29.99")),
	                new Item("papaya", 20, new BigDecimal("9.99")),
	                new Item("apple", 10, new BigDecimal("9.99")),
	                new Item("banana", 10, new BigDecimal("19.99")),
	                new Item("apple", 20, new BigDecimal("9.99")));
		 return items;
				
	}
}
