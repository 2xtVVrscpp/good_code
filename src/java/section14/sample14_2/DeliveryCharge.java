package section14.sample14_2;

public class DeliveryCharge {
	final int amount;

	/**
	 * 配送料を返す。
	 * @param products 配送対象の商品リスト
	 * @return 配送料
	 */
	DeliveryCharge(final ShoppingCart shoppingCart) {
		if(shoppingCart.totalPrice() < 2000) {
			amount = 500;
		} else {
			amount = 0;
		}
	}
}
