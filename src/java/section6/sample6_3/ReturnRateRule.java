package section6.sample6_3;

class ReturnRateRule implements ExcellentCustomerRule{
	
	double _rate;
	public ReturnRateRule(double rate) {
		_rate = rate;
	}
	
	public boolean ok(final PurchaseHistory history) {
		return history.returnRate_ <= _rate;			
	}

}
