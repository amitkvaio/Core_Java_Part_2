package amitsimplyfiedtutorial.com.KforEach;
import java.util.HashMap;
import java.util.Map;

public class ForEachMap {
	public static void main(String[] args) {
		//Normal way
		Map<String, Integer> itemsMap = new HashMap<>();
		itemsMap.put("A", 10);
		itemsMap.put("B", 20);
		itemsMap.put("C", 30);
		itemsMap.put("D", 40);
		itemsMap.put("E", 50);
		itemsMap.put("F", 60);

		/*for (Map.Entry<String, Integer> entry : itemsMap.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}*/
		itemsMap.forEach((key,value)-> System.out.println(key +" "+value));
		
		System.out.println("-------------------");
		itemsMap.forEach((key,value)->{
			if("D".equals(key)) {
				System.out.println(key +" "+value);
			}
		});
	}
}
