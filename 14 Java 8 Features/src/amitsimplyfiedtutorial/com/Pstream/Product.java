package amitsimplyfiedtutorial.com.Pstream;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	public static List<Product> getProductList(){
		List<Product> productList = new ArrayList<Product>();
		// Adding Products
		productList.add(new Product(1, "Sony mobile", 25000));
        productList.add(new Product(2, "Lenovo mobile", 15000));
        productList.add(new Product(3, "Nokia mobile", 10000));
        productList.add(new Product(4, "Samsung mobile", 40000));
		return productList;
	}

}
