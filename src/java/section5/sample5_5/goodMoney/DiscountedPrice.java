package section5.sample5_5.goodMoney;

class DiscountedPrice {
  final int _amount;

  /**
   * @param regularPrice 定価
   * @param discountRate 割引率
   */
  DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
    // regularPriceとdiscountRateを使った計算
    // 計算内容追加
    this._amount = (int) (regularPrice.amount * (1 - discountRate._discountRate));
  }
}
