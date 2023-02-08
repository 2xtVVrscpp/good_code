package section5.sample5_5.goodMoney;

public class Main {
	public static void main(String[] args) {
		// このたとえ、いまいちよくわからなかった。。
		// どっちも同じクラスで設計できそう。
		RegularPrice regularPrice = new RegularPrice(1000);
		DiscountRate discountRate = new DiscountRate(0.1f);
		DiscountedPrice discountedPrice = new DiscountedPrice(regularPrice, discountRate);
		System.out.println(discountedPrice._amount);
	}
}
