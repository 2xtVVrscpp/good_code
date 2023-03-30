package section6_part2.sample6_3;

public class GoldCustomerPolicy {

	private final ExcellentCustomerPolicy policy;	

	double goldReturnRate = 0.001;
	
	GoldCustomerPolicy(){
		policy = new ExcellentCustomerPolicy();
		policy.add(new GoldCustomerPurchaseAmountRule());
		policy.add(new PurchaseFrequencyRule());
		policy.add(new ReturnRateRule(goldReturnRate));
	}

	/**
	 * @param history 購入履歴
	 * @return ルールを全て満たす場合true
	 */
	boolean complyWithAll(final PurchaseHistory history) {
		return policy.complyWithAll(history);

	}

}
