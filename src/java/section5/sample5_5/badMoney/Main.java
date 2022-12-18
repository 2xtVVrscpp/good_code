package section5.sample5_5.badMoney;

public class Main {
	public static void main(String[] args) {
		Common common = new Common();
		Util util = new Util();

		int regularPrice = 1000;
		float discountedPrice = 0.1f;

		discountedPrice = common.discountedPrice(regularPrice, discountedPrice);
		System.out.println(discountedPrice);

		System.out.println(util.isFairPrice(regularPrice));

	}
}
