package amitsimplyfiedtutorial.com.Pstream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Steam05 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		// Converting Product List into a Map
		Map<String, Integer> productPriceMap = productList.stream()
		                .collect(Collectors.toMap(p -> p.getName(), p -> p.getPrice()));

		        System.out.println(productPriceMap);


	}
}
