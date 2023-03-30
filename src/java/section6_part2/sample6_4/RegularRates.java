package section6_part2.sample6_4;


public class RegularRates implements HotelRates{

	public Money fee() {
		return new Money(7000, "EN");
	}

	public Money busySeasonFee() {
		return fee().add(new Money(3000, "EN"));
	}

}
