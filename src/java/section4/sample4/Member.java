package section4.sample4;

class Member {
	final HitPoint _hitPoint;
	final States _states;

	Member() {
		_hitPoint = new HitPoint(100);
		_states = new States();
	}

	/**
	 * ダメージを受ける
	 * @param damageAmount ダメージ量
	 */
	void damage(final int damageAmount) {
		_hitPoint.damage(damageAmount);
		if (_hitPoint.isZero()) {
			_states.add(StateType.dead);
		}
	}

	//ダメージと状態を表示する
	void showMember(){
		_hitPoint.show();
		_states.show();
	}
}
