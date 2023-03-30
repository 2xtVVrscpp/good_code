package section6_part2.sample6_6;

import java.util.HashSet;
import java.util.Set;

import section4.sample4.StateType;

public class States {
	private final Set<StateType> _stateSet;

	public States() {
		_stateSet = new HashSet<>();
	}

	public void add(StateType stateType) {
		_stateSet.add(stateType);
	}

	public void show(){
		System.out.println("states : " + _stateSet);
	}
}
