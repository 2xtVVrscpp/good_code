package section6.sample6_4;


public class PremiumRates implements HotelRates{
	
	int premiumRate = 12000;
	int busySeasonFee = 5000;
	
	public Money fee() {
		return new Money(premiumRate, "EN");
	}

	public Money busySeasonFee() {
		return fee().add(new Money(busySeasonFee, "EN"));
	}
}
