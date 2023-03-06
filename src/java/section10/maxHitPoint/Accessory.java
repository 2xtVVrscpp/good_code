package section10.maxHitPoint;

public class Accessory {
	private static final int MIN = 10;
	private static final int MAX = 99;
	private final int _value;

	public Accessory(final int value){
		if (value < MIN || MAX < value) {
			throw new IllegalArgumentException();
		}
		this._value = value;
	}

	public int maxHitPointIncrements() {
		return _value;
	}
}
