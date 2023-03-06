package section10.maxHitPoint;

public class OriginalMaxHitPoint {
	private static final int MIN = 10;
	private static final int MAX = 999;
	final int _value;

	OriginalMaxHitPoint(final int value) {
		if (value < MIN || MAX < value) {
			throw new IllegalArgumentException();
		}
		this._value = value;
	}
}
