package section4.sample2;

class AttackPower {
	static final int MIN = 0;
	int _value;

	public AttackPower(int value) {
		if (value < MIN) {
			throw new IllegalArgumentException("ERROR! : value < MIN");
		}

		_value = value;
	}

	/**
	 * 攻撃力を強化する
	 * @param increment 攻撃力の増分
	 */
	public void reinForce(int increment) {
		_value += increment;
	}

	/** 無力化する */
	public void disable() {
		_value = MIN;
	}
}
