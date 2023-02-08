package section6_part1.sample1_nest;

import section6_part1.StateType;
import section6_part1.States;

class Member {
	final int _hitPoint;
	int _magicPoint;
	private final States _states;

	Member() {
		_hitPoint = 100;
		_magicPoint = 100;
		_states = new States();
	}

	// 行動可能かを判定
	boolean canAct() {
		for (StateType status : _states.getStatusSet()) {
			// 行動可能でない場合falseを返す
			if (!status.canAct()) {
				return false;
			}
		}
		return true;
	}

	// magicPointを消費
	void consumeMagicPoint(final int costMagicPoint) {
		_magicPoint = _magicPoint - costMagicPoint;
	}

	// 魔法の発動
	void chant(final Magic magic) {
		// 処理
		System.out.println(magic.getName());
	}
}
