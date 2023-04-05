package section6_part2.sample6_3;

interface ExcellentCustomerRule{
	/**
	 * @return 条件を満たす場合true
	 * @param history 購入履歴
	 */
	boolean ok(final PurchaseHistory history);

}
