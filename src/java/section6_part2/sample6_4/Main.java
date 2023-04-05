package section6_part2.sample6_4;


public class Main {

	public static void main(String[] args) {
		HotelRates hotelRates = new RegularRates();
		RegularRates hotelRates2 = new RegularRates();

		Money busySeasonFee = null;

		
		//不明な値に対して固定の値をadd
		if(hotelRates instanceof RegularRates) {
			busySeasonFee = hotelRates.fee().add(new Money(3000,"EN"));	
		}
		else if(hotelRates instanceof PremiumRates) {
			busySeasonFee = hotelRates.fee().add(new Money(7000,"EN"));	
		}

		hotelRates.fee().printMoney();
		System.out.println("busySeasonFee" + busySeasonFee._amount);



		Money busySeasonFee2 = hotelRates.busySeasonFee();
		hotelRates.fee().printMoney();
		System.out.println("busySeasonFee" + busySeasonFee2._amount);

	}

}
