package section14.sample14_2;

public class DeliveryCharge {
	final int amount;

	DeliveryCharge(final ShoppingCart shoppingCart) {
		amount = DeliveryManager.deliveryCharge(shoppingCart.products);
	}
}
