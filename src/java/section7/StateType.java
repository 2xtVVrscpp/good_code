package section7;

public enum StateType {
	// 眠り
	SLEEP("sleep", false),
	// 麻痺
	paralysis("paralysis", false),
	//毒
	Poison("poison",  true),
	//死亡
	dead("dead", false);

	// ステータス名
	private final String _name;
	// 行動可能か
	private final boolean _canAct;

	StateType(String name, boolean canAct) {
		_name = name;
		_canAct = canAct;
	}

	public boolean canAct() {
		return _canAct;
	}
}
