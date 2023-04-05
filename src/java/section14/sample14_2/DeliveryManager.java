package section14.sample14_2;

public class DeliveryManager {
	
	/**
	 * 配送料を返す。
	 * @param products 配送対象の商品リスト
	 * @return 配送料
	 */
	public static int deliveryCharge(ShoppingCart shoppingCart) {
		int charge = 0;
		if(shoppingCart.totalPrice() < 2000) {
			charge = 500;
		} else {
			charge = 0;
		}
		
		return charge;
		
	}

}
