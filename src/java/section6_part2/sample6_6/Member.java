package section6_part2.sample6_6;

import section4.sample4.StateType;

class Member {
	final HitPoint _hitPoint;
	States _states;

	String states;

	int hitPoint;
	int magicPoint;

	Member() {
		_hitPoint = new HitPoint(100);
		_states = new States();
		hitPoint = 100;
		magicPoint = 200;
		states = "alive";
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
