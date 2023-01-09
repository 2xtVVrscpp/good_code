package section6_part1;

import java.util.HashSet;
import java.util.Set;

public class States {
	private final Set<StateType> _stateSet;

	public States() {
		_stateSet = new HashSet<>();
	}

	// 現在のステータス一覧を返す
	public Set<StateType> getStatusSet() {
		return _stateSet;
	}
}
