package section10.maxHitPoint;

public class CorrectedMaxHitPoint {
	final int _value;

	CorrectedMaxHitPoint(final OriginalMaxHitPoint originalMaxHitPoint, final Accessory accessory, final Armor armor) {
		_value = originalMaxHitPoint._value
				+ accessory.maxHitPointIncrements()
				+ armor.maxHitPointIncrements();
	}
}
