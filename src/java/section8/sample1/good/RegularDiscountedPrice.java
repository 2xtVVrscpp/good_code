package section8.sample1.good;

import section8.sample1.good.RegularPrice;

class RegularDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 400;
    final int amount;

    /**
     * @param price
     */
    RegularDiscountedPrice(final RegularPrice price) {
        int discountAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountAmount < MIN_AMOUNT) {
            discountAmount = MIN_AMOUNT;
        }
        this.amount = discountAmount;
    }
}
