package section6.sample6_3;

class GoldCustomerPurchaseAmountRule implements ExcellentCustomerRule{
	public boolean ok(final PurchaseHistory history) {
		return 100000 <= history.totalAmount_;
	}

}
