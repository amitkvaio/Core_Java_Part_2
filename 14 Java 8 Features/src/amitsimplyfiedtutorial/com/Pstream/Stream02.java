package amitsimplyfiedtutorial.com.Pstream;

import java.util.List;

public class Stream02 {
	public static void main(String[] args) {
		List<Product> prodList = Product.getProductList();
		int add = prodList.stream().map(per -> per.getPrice()).reduce(0, (sum, price) -> sum + price);
		System.out.println("Addition : "+add);
		
		Integer totalPrice2 = prodList.stream()  
                .map(product->product.getPrice())  
				.reduce(0,Integer::sum);  
		// accumulating price, by referring method of Integer class
		System.out.println(totalPrice2);

	}
}
