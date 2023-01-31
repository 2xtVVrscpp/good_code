package section6.sample6_3;

class PurchaseFrequencyRule implements ExcellentCustomerRule{
	public boolean ok(final PurchaseHistory history) {
		return 10 <= history.purchaseFrequencyPerMonth_;
	}

}
