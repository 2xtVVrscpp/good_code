package section5.sample5_5.goodMoney;

public class DiscountRate {
	// 内容all追加
	float _discountRate;

	DiscountRate(final float discountRate) {
		if (discountRate < 0.0f) {
			throw new IllegalArgumentException();
		}
		this._discountRate = discountRate;
	}
}
