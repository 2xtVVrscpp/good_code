package section14.sample14_2;

public class DeliveryCharge {
	private static final int CHARGE_FREE_THRESHOLD = 2000;
	private static final int PAY_CHAGE = 500;
	private static final int CHARGE_FREE = 0;
	final int amount;

	/**
	 * 配送料を返す。
	 * @param products 配送対象の商品リスト
	 * @return 配送料
	 */
	DeliveryCharge(final ShoppingCart shoppingCart) {
		if(shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) {
			amount = PAY_CHAGE;
		} else {
			amount = CHARGE_FREE;
		}
	}
}
