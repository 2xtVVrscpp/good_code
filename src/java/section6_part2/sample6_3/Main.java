package section6_part2.sample6_3;

public class Main {

	public static void main(String[] args) {
		PurchaseHistory history = new PurchaseHistory();
		history.totalAmount_= 90000;
		history.purchaseFrequencyPerMonth_ = 11;
		history.returnRate_= 0.001;

		
		GoldCustomerPolicy goldCustomerPolicy = new GoldCustomerPolicy(); 
		SilverCustomerPolicy silverCustomerPolicy = new SilverCustomerPolicy();
	

		System.out.println(isGoldCustomer(history));
		System.out.println(isSilverCustomer(history));

		System.out.println(goldCustomerPolicy.complyWithAll(history));
		System.out.println(silverCustomerPolicy.complyWithAll(history));

	}

	
	
	
	
	/**
	 * @return ゴールド会員である場合true
	 * @param history 購入履歴
	 */
	static boolean isGoldCustomer(PurchaseHistory history) {
		if(100000 <= history.totalAmount_) {
			if(10 <= history.purchaseFrequencyPerMonth_) {
				if(history.returnRate_ <= 0.001) {
					return true;
				}
			}
		}
		return false;

	}


	/**
	 * @return シルバー会員である場合true
	 * @param history 購入履歴
	 */
	static boolean isSilverCustomer(PurchaseHistory history) {
		if(10 <= history.purchaseFrequencyPerMonth_) {
			if(history.returnRate_ <= 0.002) {
				return true;
			}
		}

		return false;

	}

}
