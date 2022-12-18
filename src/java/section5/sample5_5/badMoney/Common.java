package section5.sample5_5.badMoney;

class Common {
  /**
   * @param regularPrice 定価
   * @param discountRate 割引率
   * @return 割引価格
   */
  int discountedPrice(int regularPrice, float discountRate) {
    if (regularPrice < 0) {
      throw new IllegalArgumentException();
    }
    if (discountRate < 0.0f) {
      throw new IllegalArgumentException();
    }

    // add calculation
    int discountedPrice = (int) (regularPrice * (1 - discountRate));

    return discountedPrice;
  }
}
