package amitsimplyfiedtutorial.com.Pstream;

import java.util.List;

public class Stream04 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		// max() method to get max Product price
		Product maxPriceProduct = productList.stream()
				.max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

		System.out.println("Max price product = " + maxPriceProduct);

		// min() method to get min Product price
		Product minPriceProduct = productList.stream()
				.min((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

		System.out.println("Min price product = " + minPriceProduct);

	}
}
