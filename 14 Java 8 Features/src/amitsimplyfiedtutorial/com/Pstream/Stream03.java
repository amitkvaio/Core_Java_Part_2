package amitsimplyfiedtutorial.com.Pstream;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Stream03 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		/*
		 * Using Collectors's method to sum the prices.
		 */
		LongSummaryStatistics longSummaryStatistics = productList.stream()
				.collect(Collectors.summarizingLong((product -> product.getPrice())));

		System.out.println(longSummaryStatistics);
		System.out.println("Count = " + longSummaryStatistics.getCount());
		System.out.println("Sum = " + longSummaryStatistics.getSum());
		System.out.println("Max Price = " + longSummaryStatistics.getMax());
		System.out.println("Min Price = " + longSummaryStatistics.getMin());
		System.out.println("Average Price = " + longSummaryStatistics.getAverage());

	}

}
