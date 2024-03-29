package section10.maxHitPoint;

public class Member {
	private OriginalMaxHitPoint _originalMaxHitPoint;
	private Accessory _accessory;
	private Armor _armor;
	private CorrectedMaxHitPoint _correctedMaxHitPoint;

	public Member(final OriginalMaxHitPoint originalMaxHitPoint, final Accessory accessory, final Armor armor){
		_originalMaxHitPoint = originalMaxHitPoint;
		_accessory = accessory;
		_armor = armor;

		// CorrectedMaxHitPointの生成
		_correctedMaxHitPoint = new CorrectedMaxHitPoint(_originalMaxHitPoint, _accessory, _armor);
	}

	// equipAccessoryやequipArmorと名付けると動詞+目的語となる
	// javaのオーバーロードを利用してequipメソッドを2つ作る
	public void equip(Accessory accessory){
		_accessory = accessory;
		// 補正された最大HPの再計算
		_correctedMaxHitPoint = new CorrectedMaxHitPoint(_originalMaxHitPoint, _accessory, _armor);
	}

	public void equip(Armor armor){
		_armor = armor;
		// 補正された最大HPの再計算
		_correctedMaxHitPoint = new CorrectedMaxHitPoint(_originalMaxHitPoint, _accessory, _armor);
	}

	public void showAbility(){
		System.out.println("----- member ability -----");
		System.out.println(" OriginalMaxHitPoint = " + _originalMaxHitPoint._value );
		System.out.println("Accessory Increments = " + _accessory.maxHitPointIncrements() );
		System.out.println("    Armor Increments = " + _armor.maxHitPointIncrements() );
		System.out.println("CorrectedMaxHitPoint = " + _correctedMaxHitPoint._value );
		System.out.println("--------------------------");
	}
}
