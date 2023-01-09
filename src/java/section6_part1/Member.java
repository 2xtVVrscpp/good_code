package section6_part1;

public class Member {
	final int _hitPoint;
	int _magicPoint;
	private final States _states;
	public final int _level;
	public final int _agility;
	public final int _magicAttack;
	public final int _vitality;

	public Member() {
		_hitPoint = 100;
		_magicPoint = 100;
		_states = new States();
		_level = 1;
		_agility = 1;
		_magicAttack = 1;
		_vitality = 1;
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
