package amitsimplyfiedtutorial.com.Alambda;

import java.util.HashMap;
import java.util.Map;

//Iterating Map in Java 8 using Lambda expression
public class IterateMapUsingLambda {
	public static void main(String[] args) {

		Map<String, Integer> mapPrices = new HashMap<>();
		mapPrices.put("Apple", 50);
		mapPrices.put("Orange", 20);
		mapPrices.put("Banana", 10);
		mapPrices.put("Grapes", 40);
		mapPrices.put("Papaya", 50);

		mapPrices.forEach((key, values) -> {
			System.out.println(key + " " + values);
		});

	}
}
