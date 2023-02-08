package section6.sample6_6;

class HitPoint {
	private static final int MIN = 0;
	int _amount;

	HitPoint(final int amount) {
		if (amount < MIN) {
			throw new IllegalArgumentException("ERROR! : value < MIN");
		}

		_amount = amount;
	}

	/**
	 * ダメージを受ける
	 * @param damageAmount ダメージ量
	 */
	void damage(final int damageAmount) {
		final int nextAmount = _amount - damageAmount;
		_amount = Math.max(MIN, nextAmount);	//_amountが0未満にならないように処理
	}

	/** @return ヒットポイントがゼロであればtrue */
	boolean isZero() {
		return _amount == MIN;
	}

	//ダメージ表示メソッド
	public void show(){
		System.out.println("amout : " + _amount);
	}
}
