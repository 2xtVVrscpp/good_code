package section14.sample14_2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private final List<Product> products;

	ShoppingCart() {
		products = new ArrayList<Product>();
	}

	private ShoppingCart(List<Product> products) {
		this.products = products;
	}
	
	ShoppingCart add(final Product product) {
		final List<Product> adding = new ArrayList<>(products);
		adding.add(product);
		return new ShoppingCart(adding);
	}
	
	/**
	 * @return 商品の合計金額
	 */
	int totalPrice() {
		int amount = 0;
		for (Product each : products) {
			amount += each.price;
		}
		return amount;
	}
	
}
