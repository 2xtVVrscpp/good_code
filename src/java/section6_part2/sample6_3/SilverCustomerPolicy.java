package section6.sample6_3;

public class SilverCustomerPolicy {

	private final ExcellentCustomerPolicy policy;	

	SilverCustomerPolicy(){
		policy = new ExcellentCustomerPolicy();
		policy.add(new PurchaseFrequencyRule());
		policy.add(new ReturnRateRule(0.002));
	}

	/**
	 * @param history 購入履歴
	 * @return ルールを全て満たす場合true
	 */
	boolean complyWithAll(final PurchaseHistory history) {
		return policy.complyWithAll(history);

	}

}
