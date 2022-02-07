package amitsimplyfiedtutorial.com.Pstream;

import java.util.List;
import java.util.stream.Collectors;

//product, whose price is less than 20000
public class Stream01 {
	public static void main(String[] args) {
		List<Product> prodList = Product.getProductList();
		List<Product> filterList=prodList.stream().
					filter(person->person.getPrice() < 20000).collect(Collectors.toList());
		filterList.forEach(per->System.out.println(per.getName()));
	}
}
