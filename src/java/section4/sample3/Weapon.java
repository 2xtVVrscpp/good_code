package section4.sample3;

class Weapon {
	final AttackPower _attackPower;

	Weapon(final AttackPower attackPower) {
		_attackPower = attackPower;
	}

	/**
	 * 武器を強化する
	 * @param increment 攻撃力の増分
	 * @return 強化した武器
	 */
	Weapon reinForce(final AttackPower increment) {
		AttackPower reinForced = _attackPower.reinForce(increment);
		return new Weapon(reinForced);
	}
}
