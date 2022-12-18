package section5.sample5_2.goodGiftPoint;

import section5.sample5_2.ConsumptionPoint;

class GiftPoint {
  private static final int MIN_POINT = 0;
  private static final int STANDARD_MEMBERSHIP_POINT = 3000;
  private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
  final int value;

  // 外部からはnewできない。
  // クラス内部でのみnewできる。
  private GiftPoint(final int point) {
    if (point < MIN_POINT) {
      throw new IllegalArgumentException("ポイントが0以上ではありません。");
    }

    value = point;
  }

  /**
   * @return 標準会員向け入会ギフトポイント
   */
  static GiftPoint forStandardMembership() {
    return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
  }

  /**
   * @return プレミアム会員向け入会ギフトポイント
   */
  static GiftPoint forPremiumMembership() {
    return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
  }

  // 以下、badGiftPoint からコピペ＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
  /**
   * ポイントを加算する。
   *
   * @param other 加算ポイント
   * @return 加算後の残余ポイント
   */
  GiftPoint add(final GiftPoint other) {
    return new GiftPoint(value + other.value);
  }

  /**
   * @return 残余ポイントが消費ポイント以上であればtrue
   */
  boolean isEnough(final ConsumptionPoint point) {
    return point.value <= value;
  }

  /**
   * ポイントを消費する。
   *
   * @param point 消費ポイント
   * @return 消費後の残余ポイント
   */
  GiftPoint consume(final ConsumptionPoint point) {
    if (!isEnough(point)) {
      throw new IllegalArgumentException("ポイントが不足しています。");
    }

    return new GiftPoint(value - point.value);
  }
}
