package section5.sample5_5.goodMoney;

class RegularPrice {
  final int amount;

  /**
   * @param amount 金額
   */
  RegularPrice(final int amount) {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    this.amount = amount;
  }
}
